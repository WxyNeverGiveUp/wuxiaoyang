/*-----------------------------------------------------------------------------
* @Description:     linkage相关js
* @Version:         1.0.0
* @author:          qiyuan(632546952@qq.com)
* @date             2016.7.22
* ==NOTES:=============================================
* v1.0.0(2016.7.22):
     初始生成
* ---------------------------------------------------------------------------*/
KISSY.add('module/linkage',function(S,core){
	PW.namespace('module.linkage');
	PW.module.linkage = function(param){
		new core(param);
	};
},{
	requires:['linkage/core']
});
/*----------------------------------linkage-----------------------------------*/
KISSY.add('linkage/core',function(S){
	var
		$ = S.all, on = S.Event.on,
		LinkageIO = PW.io.module.linkage, //定义一个IO层入口
	el = {
        qualification: '.J_qualification',//学生类别
		majorClass: '.J_majorClass',//专业大类
        majorMinorClass: '.J_majorMinorClass',//专业中类
        majorName: '.J_majorName',//专业名称
        J_college: '#college', // 派遣学籍模块学院
        J_historical_college: '#historical-college' // 历史就业数据模块的学院
	};

	function core(param){
		this.opts = S.merge(el,param);
        this.init();
	}
	S.augment(core,{
		init:function(){
			this._addEventListener();
		},
		_addEventListener:function(){
            var 
                qualificationId = 0,
                majorClassId = 0,
                majorMinorId = 0;
             //专业联动
            $(el.qualification).on('change',function(ev){
                $(".other-major").hide().children("input").attr("disabled", "true");
                var qualificationId = $(ev.currentTarget).children('option:selected').val();
                LinkageIO.majorClassIO({qualification:qualificationId} , function(rs,data,msg){
                    if(rs){
                        var
                            that = this,
                            opts = that.opts,
                            majorClassOptions = '<option value="-1">请选择专业大类</option>';
                        S.each(data,function(majorClass,o){
                            majorClassOptions = majorClassOptions + '<option value="'+majorClass.majorCode+'">'+majorClass.majorName+'</option>';
                        });
                        $currentTarget = $(ev.currentTarget).parent().children(".J_majorClass");
                        $currentTarget.html(majorClassOptions);
                        $currentTarget.val(0);
                        $(ev.currentTarget).parent().children(".J_majorMinorClass").val(0);
                        $(ev.currentTarget).parent().children(".J_majorName").val(0);
                    }
                });
            });
            $(el.majorClass).on('change',function(ev){
                $(".other-major").hide().children("input").attr("disabled", "true");
                var majorClassId = $(ev.currentTarget).children('option:selected').val();
                var qualificationId = $(el.qualification).children('option:selected').val();
                LinkageIO.majorMinorClassIO({majorCode:majorClassId, qualification:qualificationId} , function(rs,data,msg){
                    if(rs){
                        var
                            that = this,
                            opts = that.opts,
                            MinorClassOptions = '<option value="-1">请选择专业中类</option>';
                        S.each(data,function(minorClass,o){
                            MinorClassOptions = MinorClassOptions + '<option value="'+minorClass.majorCode+'">'+minorClass.majorName+'</option>';
                        });
                        $currentTarget = $(ev.currentTarget).parent().children(".J_majorMinorClass");
                        $currentTarget.html(MinorClassOptions);
                        $currentTarget.val(0);
                        $(ev.currentTarget).parent().children(".J_majorName").val(0);
                    }
                });
            });
            $(el.majorMinorClass).on('change',function(ev){
                $(".other-major").hide().children("input").attr("disabled", "true");
                var majorMinorClassId = $(ev.currentTarget).children('option:selected').val();
                var qualificationId = $(el.qualification).children('option:selected').val();
                LinkageIO.majorNameIO({majorCode:majorMinorClassId, qualification:qualificationId} , function(rs,data,msg){
                    if(rs){
                        var
                            that = this,
                            opts = that.opts,
                            majorNameOptions = '<option value="-1">请选择专业</option>';
                        S.each(data,function(majorName,o){
                            majorNameOptions = majorNameOptions + '<option value="'+majorName.majorCode+'">'+majorName.majorName+'</option>';
                        });
                        $currentTarget = $(ev.currentTarget).parent().children(".J_majorName");
                        $currentTarget.html(majorNameOptions);
                        $currentTarget.val(0);
                    }
                });
            });
            $(el.majorName).on('change',function(ev){
                var majorNameId = $(el.majorName).children('option:selected').html();
                if(majorNameId=="其他") {
                    $(".other-major").show().children("input").attr("disabled", false);
                }
                else{
                    $(".other-major").hide().children("input").attr("disabled","ture");
                }
            });
            // 选择学院可以联动
            $(el.J_college).on('change',function(ev){
                var collegeCode = $(ev.currentTarget).children('option:selected').val();
                LinkageIO.linkageMajorIO({college:collegeCode},function(rs,data,errorMes){
                    if(rs){
                        var
                            that = this,
                            opts = that.opts,
                            majorNameOptions = '<option value="-1">请选择专业</option>';
                        console.log(rs);
                        S.each(data,function(i,o) {
                            majorNameOptions = majorNameOptions + '<option value=' + i.majorCode + '>' + i.majorName + '</option>';
                        });
                        $('#majorCode').html(majorNameOptions);
                        $('#majorCode').val(0);
                    }else{
                        S.log(errorMes);
                    }
                });
            });
            // 历史数据专业联动
            $(el.J_historical_college).on('change',function(ev){
                var collegeCode = $(ev.currentTarget).children('option:selected').val();
                LinkageIO.historicalLinkageMajorIO({college:collegeCode},function(rs,data,errorMes){
                    if(rs){
                        var
                            that = this,
                            opts = that.opts,
                            majorNameOptions = '<option value="">请选择专业</option>';
                        S.each(data,function(i,o) {
                            majorNameOptions = majorNameOptions + '<option value=' + i.majorCode + '>' + i.majorName + '</option>';
                        });
                        $('#historical-college-majorCode').html(majorNameOptions);
                        $('#historical-college-majorCode').val(0);
                    }else{
                        S.log(errorMes);
                    }
                });
            });

        },
	});
	return core;
},{
	requires:['core' , 'io/module/linkage']
});