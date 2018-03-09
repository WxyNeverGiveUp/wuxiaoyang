/*-----------------------------------------------------------------------------
* @Description:     派遣-学生列表相关js
* @Version:         n.n.n
* @author:          lixingyu(starsuniverseLi@gmail.com)
* @date             2016.7.12
* ==NOTES:=============================================
* vn.n.n(2016.7.12):
     初始生成
* ---------------------------------------------------------------------------*/
/*给它制造命名空间，专门存放各个页面js,被主页面调用*/
KISSY.add('page/admin_page/students_management/dispatch/studentList', function(S,List,getMajor,linkage) {
	PW.namespace('page.admin_page.students_management.dispatch.studentList');
    PW.page.admin_page.students_management.dispatch.studentList = function(param) {
        new List(param);
        new getMajor(param);
        new linkage(param);
    };
},{
    requires:[
        'studentList/List','studentList/getMajor','studentList/linkage'
    ]

});
/*-------------------------------------------------------------------*/
/*开始改页面模块的js内容*/
KISSY.add('studentList/List', function(S) {
	var $ = S.all,
        /*on = S.Event.on, //绑定静态节点*/
        /*delegate = S.Event.delegate, //绑定静态节点*/

        dispatch_stuIO = PW.io.admin_page.students_management.dispatch.studentList, //定义一个IO层入口

        Pagination = PW.mod.Pagination,
        Defender = PW.mod.Defender,
        Dialog = PW.mod.Dialog,        //定义要使用的组件

        urls = PW.Env.url.admin_page.students_management.dispatch.studentList, //定义数据入口

        el = {
           stuType:'#stuType',
           sex:'#sex',
           sex:'#sex',
           college: '#college',
           qualificationId: '#qualificationId',
           normalStuId: '#normalStuId',
           politicalStand: '#politicalStand',
           // majorCode:'.major_input', // 输入专业
           reportModeId:'#reportModeId',
           provinceId: '#provinceId',
           provinceInId: '#provinceInId',
           whereaboutgoId: '#whereaboutgoId',
           reportedModeId: '#reportedModeId',
           keyword: '#keyword',
           deputySecretaryCheckResult: '#deputySecretaryCheckResult',
           counsellorCheckResult:'#counsellorCheckResult',
           majorCode:'#majorCode',
           linkageMajor:'.linkage-major',
           filter:'.filter', // 查询筛选按钮
           filterCheck: '.filterCheck', // 筛选的选项
           filterAll: '#J_filterAll', // 筛选的全选选项
           filterResult: '#filterResult', // 筛选列表
           filterIt: '#filterIt', // 筛选按钮
           close: '.close',
            pass: '.pass',  // 批量通过按钮
            repulse: '.repulse',  // 批量打回
            checkToPass: '.checkToPass', // 批量通过每一个学生的选择选项
            passAll: '#J_passAll', // 批量通过的全选选项
           querybtn: '#querybtn',
           orders:".order",
           ids:".stuId",
           viewbtn:".view",
           statebtn:".state",
           stateBox:".stateBox",
           X:".stateBox .X",
           delbtn:".delete"

        };


        function List(param) {
            this.opts = param; //分页调用的参数,刷分页，永远都要用到它
            this.pagination;
            this._init();
        }

        S.augment(List, {
            _init: function() {
                this._pagination();
                this._addEventListener();
                this._filter();
            },

            _pagination: function(selectParam) {
                var
                    that = this,
                    opts = that.opts;
                    that.pagination = Pagination.client(opts);
            },

            _addEventListener: function() {
                var
                    that = this,
                    opts = that.opts;


                /*--点击查询按钮--*/

                $(el.querybtn).on('click',function(ev){
                    var stuType = $(el.stuType).children('option:selected').val(),
                    sex = $(el.sex).children('option:selected').val(),
                    college = $(el.college).children('option:selected').val(),
                    qualificationId = $(el.qualificationId).children('option:selected').val(),
                    normalStuId = $(el.normalStuId).children('option:selected').val(),
                    politicalStand = $(el.politicalStand).children('option:selected').val(),
                    reportModeId = $(el.reportModeId).children('option:selected').val(),
                    provinceId = $(el.provinceId).children('option:selected').val(),
                    provinceInId = $(el.provinceInId).children('option:selected').val(),
                    reportedModeId = $(el.reportedModeId).children('option:selected').val(),
                    whereaboutgoId = $(el.whereaboutgoId).children('option:selected').val(),
                    majorCode = $(el.majorCode).children('option:selected').val(),
                    keyword = $(el.keyword).val(),
                    // majorCode = $(el.majorCode).val();
                    deputySecretaryCheckResult = $(el.deputySecretaryCheckResult).children('option:selected').val();
                    counsellorCheckResult = $(el.counsellorCheckResult).children('option:selected').val();
                    S.mix(opts, {extraParam:
                                    {
                                     stuType :stuType ,
                                     sex:sex,
                                     college :college,
                                     qualificationId:qualificationId,
                                     normalStuId:normalStuId,
                                     politicalStand:politicalStand,
                                     reportModeId:reportModeId,
                                     reportedModeId:reportedModeId,
                                     provinceId:provinceId,
                                     provinceInId:provinceInId,
                                     whereaboutgoId:whereaboutgoId,
                                     keyWord:keyword,
                                     majorCode:majorCode,
                                     deputySecretaryCheckResult:deputySecretaryCheckResult,
                                     counsellorCheckResult:counsellorCheckResult,
                                    }
                            });//想传给后台的数据
                    that.pagination.reload(opts);
                });



                /*--点击查看按钮--*/
                $('body').delegate('click',el.viewbtn,function(ev){
                    var $target = $(ev.target);
                    var nowpage = $(".check").text();
                    var nowStuOrder = $target.parent().parent().first().text();
                    var lastStuOrder = $target.parent().parent().parent().last().first().text();
                    var nowStuId = $target.parent().parent().first().next().text();
                    if( nowpage == undefined){
                                                nowpage = 1;
                                            };

                    var nowStuArray = new Array();
                    var stuIds = $(".stuId");
                    for (var i = 0; i < stuIds.length; i++) {
                        nowStuArray.push(stuIds[i].innerHTML);
                    };
                    var stuType = $(el.stuType).children('option:selected').val(),
                    sex = $(el.sex).children('option:selected').val(),
                    college = $(el.college).children('option:selected').val(),
                    qualificationId = $(el.qualificationId).children('option:selected').val(),
                    normalStuId = $(el.normalStuId).children('option:selected').val(),
                    politicalStand = $(el.politicalStand).children('option:selected').val(),
                    reportModeId = $(el.reportModeId).children('option:selected').val(),
                    reportedModeId = $(el.reportedModeId).children('option:selected').val(),
                    provinceId = $(el.provinceId).children('option:selected').val(),
                    provinceInId = $(el.provinceInId).children('option:selected').val(),
                    whereaboutgoId = $(el.whereaboutgoId).children('option:selected').val(),
                    majorCode = $(el.majorCode).children('option:selected').val(),
                    keyword = $(el.keyword).val(),
                    // majorCode = $(el.majorCode).val(); // 输入的专业
                    deputySecretaryCheckResult = $(el.deputySecretaryCheckResult).children('option:selected').val();
                    counsellorCheckResult = $(el.counsellorCheckResult).children('option:selected').val();
                    var condition = {
                        stuType :stuType ,
                        sex:sex,
                        college :college,
                        qualificationId:qualificationId,
                        normalStuId:normalStuId,
                        politicalStand:politicalStand,
                        reportModeId:reportModeId,
                        reportedModeId:reportedModeId,
                        provinceId:provinceId,
                        provinceInId:provinceInId,
                        whereaboutgoId:whereaboutgoId,
                        keyWord:keyword,
                        majorCode:majorCode,
                        deputySecretaryCheckResult:deputySecretaryCheckResult,
                        counsellorCheckResult:counsellorCheckResult,
                    };
                    var conditions = JSON.stringify(condition);
                    var para = {
                                curPage:nowpage, //当前页码
                                curNo:nowStuOrder,//当前点击学生的序号
                                id: nowStuId,//当前点击学生的数据库ID
                                idList:nowStuArray,//当前页的ID顺序列表
                                conditions:conditions
                        };
                    dispatch_stuIO.nowInfo(para,function(code,data,msg){
                             if(code == 0){
                               var id = $target.parent().parent().first().next().text();
                               window.location.href="/admin/dispatch/dtl/" + id;
                            }
                    });
                    //console.log(para);
                });

                /*回车提交表单---与上面查看相关联*/
                document.onkeydown=function(){
                    var e = event ? event :(window.event ? window.event : null);
                    if(e.keyCode==13){
                        var stuType = $(el.stuType).children('option:selected').val(),
                            sex = $(el.sex).children('option:selected').val(),
                            college = $(el.college).children('option:selected').val(),
                            qualificationId = $(el.qualificationId).children('option:selected').val(),
                            normalStuId = $(el.normalStuId).children('option:selected').val(),
                            politicalStand = $(el.politicalStand).children('option:selected').val(),
                            reportModeId = $(el.reportModeId).children('option:selected').val(),
                            provinceId = $(el.provinceId).children('option:selected').val(),
                            provinceInId = $(el.provinceInId).children('option:selected').val(),
                            reportedModeId = $(el.reportedModeId).children('option:selected').val(),
                            whereaboutgoId = $(el.whereaboutgoId).children('option:selected').val(),
                            majorCode = $(el.majorCode).children('option:selected').val(),
                            keyword = $(el.keyword).val(),
                            // majorCode = $(el.majorCode).val();
                            deputySecretaryCheckResult = $(el.deputySecretaryCheckResult).children('option:selected').val();
                            counsellorCheckResult = $(el.counsellorCheckResult).children('option:selected').val();

                        S.mix(opts, {extraParam:{
                            stuType :stuType ,
                            sex:sex,
                            college :college,
                            qualificationId:qualificationId,
                            normalStuId:normalStuId,
                            politicalStand:politicalStand,
                            reportModeId:reportModeId,
                            reportedModeId:reportedModeId,
                            provinceId:provinceId,
                            provinceInId:provinceInId,
                            whereaboutgoId:whereaboutgoId,
                            keyWord:keyword,
                            majorCode:majorCode,
                            deputySecretaryCheckResult:deputySecretaryCheckResult,
                            counsellorCheckResult:counsellorCheckResult,
                        }});//想传给后台的数据
                        that.pagination.reload(opts);
                        // console.log('成功执行');
                    }
                };

                /*阻止空表单提交*/
                $('.excel').on('click',function (ev) {
                    if($('.stuorder').length == 0){
                        alert("暂无数据可打印");
                        return false;
                    }
                });
                /*--点击批量通过--*/
                $('body').delegate('click',el.pass,function(ev) {
                    var $target = $(ev.target);
                    var nowStuArray = new Array(); // 增添一个数组，把选择到的id放到这个数组中
                    var nowStuId = "";
                    var nowpage = $('.check').text(); // 当前页码
                    var result = confirm("是否确认审核通过？")
                    // 先定义一下当前对应复选框所对应的学号，把多个学号作为数组传入！
                    $('.checkToPass:checked').each(function() {
                        nowStuId = this.parent().parent().first().next();
                        for (var i = 0; i < nowStuId.length; i++) {
                            nowStuArray.push(nowStuId[i].innerHTML);
                        }
                    });
                    var para = {
                        id: nowStuArray,
                        page: nowpage
                    };
                    // 如果数组为长度为0（即没有值）的话 返回false
                    if (nowStuArray.length && result == true) {
                        dispatch_stuIO.filter(para,function(code,data,msg){
                            if(code == 0){
                                that.pagination.reload(opts);
                                $(el.passAll).attr('checked', false);
                            }
                            else if(code == 1) {
                                alert(msg);
                            }
                            // console.log(code);
                        });
                        // console.log(para);
                    }
                    else{
                        return false;
                    }
                });

                /*--批量打回--*/
                $('body').delegate('click',el.repulse,function(ev) {
                    var $target = $(ev.target);
                    var nowStuArray = new Array(); // 增添一个数组，把选择到的id放到这个数组中
                    var nowStuId = "";
                    var nowpage = $('.check').text(); // 当前页码
                    var result = confirm("是否确认审核打回？")
                    // 先定义一下当前对应复选框所对应的学号，把多个学号作为数组传入！
                    $('.checkToPass:checked').each(function() {
                        nowStuId = this.parent().parent().first().next();
                        for (var i = 0; i < nowStuId.length; i++) {
                            nowStuArray.push(nowStuId[i].innerHTML);
                        }
                    });
                    var para = {
                        id: nowStuArray,
                        page: nowpage
                    };
                    // 如果数组为长度为0（即没有值）的话 返回false
                    if (nowStuArray.length && result == true) {
                        dispatch_stuIO.repulse(para,function(code,data,msg){
                            if(code == 0){
                                that.pagination.reload(opts);
                                $(el.passAll).attr('checked', false);
                            }
                        });
                        console.log(para);
                    }
                    else{
                        return false;
                    }
                });

                /*--批量通过或者批量打回的全选功能--*/
                $('body').delegate('click',el.passAll,function(ev) {
                    // 如果全选选项选择，则给每个都添加选中
                    if ($(el.passAll).attr('checked')) {
                        $(el.checkToPass).attr('checked',true);
                    }
                    else{
                        $(el.checkToPass).attr('checked',false);
                    }
                })

                /*--点击删除按钮--*/
                $('body').delegate('click',el.delbtn,function(ev){
                    var $target = $(ev.target);
                    var nowStuId = $target.parent().parent().first().next().text();
                    var result = confirm("对学籍进行删除操作会删除该生包括学籍，签约，业务办理等所有数据，且不可恢复，确认删除吗？");
                    var para = {id: nowStuId};//当前点击学生的数据库ID

                    if(result == true){
                        dispatch_stuIO.delInfo(para,function(code,data,msg){
                            if(code == 0) {
                                $target.parent().parent().remove();
                                document.getElementById("querybtn").click();
                            }
                        });
                        //console.log(para);
                    }
                    else{
                        return;
                    }
                });

                /*点击审核按钮*/
                $('body').delegate('click',el.statebtn,function(ev){
                    var i = 5;
                    var tds = $(".stateBox table td");
                    var $target = $(ev.target);
                    var dispatchId = $target.parent().parent().first().next().next().text();/*后台要这个ID*/

                    /*审核信息框的显示与消失*/
                    $(el.stateBox).show();
                    $(el.X).on("click" , function(ev){
                        $(".stateBox").hide();
                    });

                   /* 交互接口*/
                    dispatch_stuIO.stateInfo({dispatchId:dispatchId},function(code,data,msg){
                    var jsondata = data;
                        for(var x in jsondata){
                           /* for(var y in jsondata[x]){*/
                                //console.log(jsondata[x]);
                                var nowState = jsondata[x];
                                //console.log(nowState);
                                if (((i == 8) || (i == 12))==true) {
                                    i++;
                                }
                                tds[i].innerHTML = jsondata[x];
                                i++;
                            /*}*/
                        }
                    });
                    //console.log(dispatchId);

                });
                /*--查询条件筛选--*/
                $(el.filter).on('click', function(ev) {
                    $(el.filterResult).show();
                });
                $(el.close).on('click', function(event) {
                    $(el.filterResult).hide();
                });
                /*--仿省系统的功能--*/
                /*--全选--*/
                $('body').delegate('click',el.filterAll,function(ev) {
                    if ($(el.filterAll).attr('checked')) {
                      $(el.filterCheck).attr('checked', true);
                    }
                    else{
                       $(el.filterCheck).attr('checked', false);
                    }
                });

                /*--点击多选框时判断是否全选--*/
                $(el.filterCheck).on('click',function() {
                    var flag = true;
                    $(el.filterCheck).each(function() {
                        if(!this.checked) {
                            flag = false;
                        }
                    });
                    $(el.filterAll).attr('checked',flag);
                })


                /*--筛选--*/
                /*--给筛选跟分页按钮添加事件--*/
                $('body').delegate('click',el.filterIt,function(ev) {
                    that._filter();
                    $(el.filterResult).hide();
                });

                /*校级领导的学院-专业联动*/
                $(el.college).on('change',function(ev) { /*当选择变化的时候发生改变*/
                    var $target = $(ev.target);
                    $(el.linkageMajor).removeClass('none');
                    if ($(el.college).val() == -1){
                        $(el.linkageMajor).addClass('none');
                    }
                });
            },
            /*筛选的函数*/
            _filter: function() {
                  $(el.filterCheck).each(function() {
                        if (this.attr('checked') == "checked") {
                          var checkName = this.attr('name');
                          $('.' + checkName).show();
                        }
                        else if (!(this.attr('checked') == "checked")) {
                          var notCheckName = this.attr('name');
                          $('.' + notCheckName).hide();
                        }
                    });
            }

        });

        return List;

},
{
	requires:['event','sizzle', 'mod/pagination', 'io/admin_page/students_management/dispatch/studentList']
});
/*----------------------------------suggest-----------------------------------*/
KISSY.add('studentList/getMajor',function(S){
  var
    $ = S.all, on = S.Event.on, delegate = S.Event.delegate,
    MajorIO = PW.io.module.majorName,
  el = {
    unitMajorHolder: '#J_unitMajorHolder',//指向专业
    majorFidle_unit: '#J_majorFidle_unit',//指向sugget的列表
    J_major_id_unit: '.major-id-unit',
    majorHolder: '.J_majorHolder',
  };

  function core(param){
    this.opts = param;
    this.init();
  }
  S.augment(core,{
    init:function(){
      this._addEventListener();
      this._getMajor();
    },
    _addEventListener:function(){
      var
        that = this;

      /*当输入专业名称时*/
      on(el.unitMajorHolder,'input propertychange',function(evt){
        var
          target = evt.target,
          val = $(target).val(),
          holder = $(target).next(el.majorFidle_unit);
        if(val == ''){
          that._hideMajorFidle(holder);
        }else{
          that._showMajorFidle(holder,val);
        }
      });
      // 必须匹配到
      on(el.majorHolder,'input propertychange',function(evt){
        var
          target = evt.target,
          majorInfo = that.majorInfo,
          val = $(target).val();
      });
      on(el.majorHolder,'blur',function(evt){
        var
          target = evt.target,
          val = $(target).val();
        if($(target).next("p").text()!=''){
          $(target).parent().next().children("input").val('');
        }
      });
      /*点击其他地方*/
      on('body','click',function(){
        that._hideMajorFidle(".majorFidle");
      });
    },
    /*隐藏suggest的列表*/
    _hideMajorFidle:function(target){
      $(target).hide();
    },
    /*显示suggest的列表*/
    _showMajorFidle:function(target,val){
      var
        that = this;
      that._addMajor(target,val);
      $(target).show();
    },
    /*把符合输入的专业显示在suggest的列表中*/
    _addMajor:function(holder,val){

      var
        that = this,
        majorInfo = that.majorInfo,
        liHtml = '',
        majors;
      S.each(majorInfo,function(i,o){
        if(that._suggest(val,i)){
          liHtml = liHtml + "<li majorCode=" +i.majorCode+ ">" + i.majorName + "</li>"
        }
      });
      $(holder).html(liHtml);
      majors = $('li',holder);
      /*点击专业名称*/
      on(majors,'click',function(evt){
        that._showSelectMajor(evt.target);
      });
    },

    /*正则匹配*/
    _suggest:function(val,data){
      var
        regexp = RegExp(val,"i");
      if(regexp.test(data.majorName)){
        return true;
      }else{
        return false;
      }
    },

    /*把用户选择的专业显示到输入框中*/
    _showSelectMajor:function(target){
      var
        that = this,
        major = $(target).html(),
        parent = $(target).parent();
      if($(parent).prev().prev().hasClass(el.J_major_id_unit)){
        $(parent).prev().val(major);
      }
      that._hideMajorFidle(parent);
    },
    /*获取系统中的专业*/
    _getMajor:function(){
      var
        that = this;
        MajorIO.majorName({},function(rs,data,errorMes){
        if(rs){
          that.majorInfo = data;
        }else{
          S.log(errorMes);
        }
      });
    }
  });
  return core;
},{
  requires:['core','io/module/majorName']
});
/*---------------------------------linkage------------------------------------*/
KISSY.add('studentList/linkage',function(S){
    var
        linkage = PW.module.linkage;
    function linkage(param){
        new linkage(param);
    }
    return linkage;
},{
    requires:['core','module/linkage']
});
