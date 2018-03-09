/*-----------------------------------------------------------------------------
* @Description:     派遣-学生列表ajax相关js
* @Version:         n.n.n
* @author:          lixingyu(starsuniverseLi@gmail.com)
* @date             2016.7.12
* ==NOTES:=============================================
* vn.n.n(2016.7.12):
     初始生成
* ---------------------------------------------------------------------------*/
KISSY.add('io/admin_page/students_management/dispatch/studentList' , function(S) {
	var urls;
	try {
		urls = PW.Env.url.admin_page.students_management.dispatch.studentList;
	}catch(e) {
		S.log('地址信息错误');
		return;
	}

	PW.namespace('io.admin_page.students_management.dispatch.studentList');

	S.mix(PW.io.admin_page.students_management.dispatch.studentList, {
		conn: urls,
		/*加载学生信息*/
        showStuIO: function(data,callback) {
			S.IO({
				url: urls.showStu,
				type: 'get',
				data: data,
				dataType: 'json',
				success: function(rs) {
					callback(
						rs.code == 0,
						rs.data,
						rs.errMsg
					);
				},
				error: function(rs) {
					callback(
						false,
						null,
						PW.Env.msg[0]
					);
				}
			});
		},
		/*批量通过时使用的ajax*/
        filter: function (data,callback) {
            S.IO({
                url: urls.filter,
                type: 'post',
                data: data,
                dataType: 'json',
                success: function(rs) {
                    callback(
                        rs.code,
                        rs.data,
                        rs.errMsg
                    );
                },
                error: function(rs) {
                    callback(
                        false,
                        null,
                        PW.Env.msg[0]
                    );
                }
            });
        },
		/* 批量打回 */
        repulse: function (data,callback) {
            S.IO({
                url: urls.repulse,
                type: 'post',
                data: data,
                dataType: 'json',
                success: function(rs) {
                    callback(
                        rs.code,
                        rs.data,
                        rs.errMsg
                    );
                },
                error: function(rs) {
                    callback(
                        false,
                        null,
                        PW.Env.msg[0]
                    );
                }
            });
        },
        /*传递当前点击学生相关信息（与下一个学生相连）*/
        nowInfo:function(data,callback){
			 S.IO({
	                url:urls.nowInfo,
	                type:'get',
	                data:data,
	                dataType:'json',
	                success:function(rs){
	                    callback(
	                        rs.code,
	                        rs.data,
	                        rs.errMsg
	                        );
	                },
	                error:function(rs){
	                    callback(
	                        false,
	                        null,
	                        PW.Eng.msg[0]
	                    );
	                }
            	});
		},

        /*弹出审核信息*/
		stateInfo:function(data,callback){
			 S.IO({
	                url:urls.stateInfo,
	                type:'get',
	                data:data,
	                dataType:'json',
	                success:function(rs){
	                    callback(
	                        rs.code,
	                        rs.data,
	                        rs.errMsg
	                        );
	                },
	                error:function(rs){
	                    callback(
	                        false,
	                        null,
	                        PW.Eng.msg[0]
	                    );
	                }
            	});
		},
		/*传递当前删除学生相关信息*/
        delInfo:function(data,callback){
            S.IO({
                url:urls.delInfo,
                type:'get',
                data:data,
                dataType:'json',
                success:function(rs){
                    callback(
                        rs.code,
                        rs.data,
                        rs.errMsg
                    );
                },
                error:function(rs){
                    callback(
                        false,
                        null,
                        PW.Eng.msg[0]
                    );
                }
            });
        }





    });
});