window.onload = function (){
    // document.cookie = "name=???";
    cookie_email_search();

}

function quit(){
    document.cookie = "name=???";
    window.location = "Sign.html";
}


function cookie_email_search(){
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
        req.send("type=search&method=byEmail&" + document.cookie);
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
            document.getElementById("IfUserSginIn").innerHTML = '';
            document.getElementById("dropdown04").innerText = json[0].name;
            document.getElementById("user_name").value = json[0].name;
            console.log("---------->成功:" + document.cookie);
        }else if(JSON.parse(req.responseText).length == 0){
            document.getElementById("IfUserSginIn").innerHTML = '<a href="Sign.html"><input type="button" class="btn btn-outline-primary mt-2" id="user" href="Sign.html" value="登录/注册"></a>\n'
            document.getElementById("dropdown04").innerText = "个人中心";
            console.log("---------->失败:" + document.cookie);
        }
    } else{
        document.getElementById("IfUserSginIn").innerHTML = '<a href="Sign.html"><input type="button" class="btn btn-outline-primary mt-2" id="user" href="Sign.html" value="登录/注册"></a>\n'
        document.getElementById("dropdown04").innerText = "个人中心";
        console.log("---------->失败:" + document.cookie);
    }
}


UrlParm = function() { // url参数
    var data, index;
    (function init() {
        data = [];
        index = {};
        var u = window.location.search.substr(1);
        if (u != '') {
            var parms = decodeURIComponent(u).split('&');
            for (var i = 0, len = parms.length; i < len; i++) {
                if (parms[i] != '') {
                    var p = parms[i].split("=");
                    if (p.length == 1 || (p.length == 2 && p[1] == '')) {// p | p=
                        data.push([ '' ]);
                        index[p[0]] = data.length - 1;
                    } else if (typeof (p[0]) == 'undefined' || p[0] == '') { // =c | =
                        data[0] = [ p[1] ];
                    } else if (typeof (index[p[0]]) == 'undefined') { // c=aaa
                        data.push([ p[1] ]);
                        index[p[0]] = data.length - 1;
                    } else {// c=aaa
                        data[index[p[0]]].push(p[1]);
                    }
                }
            }
        }
    })();
    return {
        // 获得参数
        parm : function(o) { // o: 参数名或者参数次序
            try {
                return (typeof (o) == 'number' ? data[o][0] : data[index[o]][0]);
            } catch (e) {
            }
        },
        //获得参数组, 类似request.getParameterValues()
        parmValues : function(o) { //  o: 参数名或者参数次序
            try {
                return (typeof (o) == 'number' ? data[o] : data[index[o]]);
            } catch (e) {
            }
        },
        //是否含有parmName参数
        hasParm : function(parmName) {
            return typeof (parmName) == 'string' ? typeof (index[parmName]) != 'undefined' : false;
        },
        // 获得参数Map ,类似request.getParameterMap()
        parmMap : function() {
            var map = {};
            try {
                for ( var p in index) {
                    map[p] = data[index[p]];
                }
            } catch (e) {
            }
            return map;
        }
    }
}();



function check_join_us() {
    var form = document.getElementById("form_join_us");
    var url = "../../../ShopsServlet";
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject("Microsoft.XMLHTTP");
    if (req) {
        //采用POST方式，异步传输
        req.open("post", url, true);
        req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        req.onreadystatechange = checkjoinComplete;
        var data = "type=add" + "&shopname="
            + encodeURIComponent(form.shop_name.value) + "&shopaddress="
            + encodeURIComponent(form.shop_address.value) + "&shoptel="
            + encodeURIComponent(form.shop_tel.value) + "&shoptext="
            + encodeURIComponent(form.shop_text.value);
        req.send(data);
    }
}

function checkjoinComplete() {
    if (req.readyState == 4 && req.status == 200) {
        document.getElementById("form_join_us").reset();
    }
}


function check_message() {
    var form = document.getElementById("form_message");
    var url = "../../../MessagesServlet";
    if (window.XMLHttpRequest)
        req = new XMLHttpRequest();
    else if (window.ActiveXObject)
        req = new ActiveXObject("Microsoft.XMLHTTP");
    if (req) {
        //采用POST方式，异步传输
        req.open("post", url, true);
        req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        req.onreadystatechange = checkMessageComplete;
        var data = "type=add" + "&messagename="
            + encodeURIComponent(form.user_name.value) + "&messagetitle="
            + encodeURIComponent(form.message_name.value) + "&messageemail="
            + encodeURIComponent(form.message_email.value) + "&messagetime="
            + getCurrentDate() + "&messagetext="
            + encodeURIComponent(form.message_text.value);
        req.send(data);
    }
}

function getCurrentDate() {
    var now = new Date();
    var year = now.getFullYear(); //得到年份
    var month = now.getMonth();//得到月份
    var date = now.getDate();//得到日期
    var day = now.getDay();//得到周几
    var hour = now.getHours();//得到小时
    var minu = now.getMinutes();//得到分钟
    var sec = now.getSeconds();//得到秒
    month = month + 1;
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;
    if (hour < 10) hour = "0" + hour;
    if (minu < 10) minu = "0" + minu;
    if (sec < 10) sec = "0" + sec;
    var time = "";
    time = year + "-" + month + "-" + date+ " " + hour + ":" + minu + ":" + sec;
    return time;
}

function checkMessageComplete() {
    if (req.readyState == 4 && req.status == 200) {
        document.getElementById("form_message").reset();
    }
}


