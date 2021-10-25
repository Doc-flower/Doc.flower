
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
        req.onreadystatechange = checkComplete;
        var data = "type=add" + "&shopname="
            + encodeURIComponent(form.shop_name.value) + "&shopaddress="
            + encodeURIComponent(form.shop_address.value) + "&shoptel="
            + encodeURIComponent(form.shop_tel.value) + "&shoptext="
            + encodeURIComponent(form.shop_text.value);
        req.send(data);
    }
}

function checkComplete() {
    if (req.readyState == 4 && req.status == 200) {
        document.getElementById("form_join_us").reset();
    }
}
