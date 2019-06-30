//Demo
layui.use(['form','element'], function(){
    var element = layui.element;
    var form = layui.form;

    //监听提交
    form.on('submit(loanFrom)', function(data){

        /*var sendJson = {
            username: $("input:text[name='username']").val(),
            password: $("input:password[name='password']").val()
        }*/

        $.ajax({
            url: 'loan/save',
            method: 'POST',
            data: JSON.stringify(data.field),
            dataType: 'JSON',
            contentType: 'application/json',
            success: function (res) {
                if (res.code == 2000) {
                    layer.alert("添加成功");
                }
            },
            error: function () {
                layer.error("添加失败");
            }
        })
        return false;
    });
});
