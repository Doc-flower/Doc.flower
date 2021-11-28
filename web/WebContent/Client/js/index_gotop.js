window.onload=function(){
    console.log(123)
    cookie_email_search()
    var gotop = document.getElementById("goTop");
    var timer =null;
    gotop.onclick = function(){
        //定时器
        timer = setInterval(function(){
            var backtop = document.documentElement.scrollTop || document.body.scrollTop;
            var speed = backtop/40;
            document.documentElement.scrollTop = backtop-speed;
            if(backtop == 0){
                clearInterval(timer);
            }
        },0.1);
    }
    //显示 or 隐藏
    var pH = 900;
    window.onscroll = function(){
        var backtop = document.documentElement.scrollTop || document.body.scrollTop;
        if(backtop>pH){
            gotop.style.display = "block";
        }
        else{
            gotop.style.display = "none";
        }
    }


}



function getCookie(c_name)
{
    if (document.cookie.length>0)
    {
        c_start=document.cookie.indexOf(c_name + "=")
        if (c_start!=-1)
        {
            c_start=c_start + c_name.length+1
            c_end=document.cookie.indexOf(";",c_start)
            if (c_end==-1) c_end=document.cookie.length
            return unescape(document.cookie.substring(c_start,c_end))
        }
    }
    return ""
}

function cookie_email_search(){
    console.log("getCookie" + getCookie("name"));
    var url = "../../../CustomerServlet";
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject("Microsoft.XMLHTTP");
    if (req) {
        //采用POST方式，异步传输
        req.open("post", url, true);
        req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        req.onreadystatechange = cookie_email_searchComplete;
        req.send("type=search&method=byEmail&name=" + getCookie("name"));
    }
}

function cookie_email_searchComplete(){
    console.log(req.readyState);

    if (req.readyState == 4 && req.status == 200 ) {
        console.log(JSON.parse(req.responseText).length);
        if(JSON.parse(req.responseText).length != 0)
        {
            var json =  JSON.parse(req.responseText);//转换为json对象
            console.log(json.length);

            document.getElementById("IfUserSginIn").innerHTML = '<a href="Person.html"><img src="../../public/img/logo.png" id="nav_user_img" class="rounded-circle" height="45" width="45" alt="."/></a>';
            document.getElementById("nav_user_img").setAttribute("src",json[0].img) ;
            document.getElementById("messages_img").value = json[0].img;
            document.getElementById("nav_user_img").classList.add("ml-5");
            document.getElementById("dropdown04").innerText = json[0].name;
            document.getElementById("user_name").value = json[0].name;
            console.log("---------->成功:" + getCookie("name"));
        }else if(JSON.parse(req.responseText).length == 0){
            document.getElementById("IfUserSginIn").innerHTML = '<a href="Sign.html"><input type="button" class="btn btn-outline-primary mt-2" id="user" href="Sign.html" value="登录/注册"></a>\n'
            document.getElementById("dropdown04").innerText = "个人中心";
            console.log("---------->失败:" + getCookie("name"));
        }
    } else{
        document.getElementById("IfUserSginIn").innerHTML = '<a href="Sign.html"><input type="button" class="btn btn-outline-primary mt-2" id="user" href="Sign.html" value="登录/注册"></a>\n'
        document.getElementById("dropdown04").innerText = "个人中心";
        console.log("---------->失败:" + getCookie("name"));
    }
}