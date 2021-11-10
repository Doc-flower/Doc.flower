function searchMessages(){
    var url = "../../../MessagesServlet";
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject("Microsoft.XMLHTTP");
    if (req) {
        //采用POST方式，异步传输
        req.open("post", url, true);
        //POST方式，必须加入如下头信息设定
        req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        req.onreadystatechange = searchMessagesComplete;
        req.send("type=search&method=search&name="+"");
    }
}

function searchMessagesComplete() {
    if (req.readyState == 4 && req.status == 200) {
        var json =  JSON.parse(req.responseText);//转换为json对象
        var messages = document.getElementById("messages");
        for(i=json.length-1; i>json.length-6; i--) {
            messages.innerHTML += '<div class="comment col-md-12 animated flipInX">\n' +
'                                        <div class="comment_name ">\n' +
'                                            <img src="../../Client/img/用户.png" height="30" width="30"/>\n' +
'                                               <span class="user_name">\n' +
'                                                '+ json[i].name + '\n' +
'                                               </span>\n' +
'                                               <span class="comment_time mx-3">\n' +
'                                                '+ json[i].time +'\n' +
'                                               </span>\n' +
'                                        </div>\n' +
'                                        <div class="comment_content" >\n' +
'                                            <p class="my-1">\n' +
'                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+ json[i].title +'\n' +
'                                            </p>\n' +
'                                        </div>\n' +
'                                    </div>'
        }
    }
}
