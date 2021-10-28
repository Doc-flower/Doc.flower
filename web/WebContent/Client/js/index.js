
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
        var data = "type=add" + "&messagename=" + "未登录用户"
            + "&messagetitle="
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


