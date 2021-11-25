$(window).scroll(function(){
    var scrollT = document.documentElement.scrollTop || document.body.scrollTop;

    var flower_admire = $("#flower_admire").offset().top - (8*$(window).height())/10;
    var flower_intro = $("#flower_intro").offset().top - (8*$(window).height())/10;
    var new_flower = $("#new_flower").offset().top - (8*$(window).height())/10;
    var contact_us = $("#contact_us").offset().top - (8*$(window).height())/10;


    if(scrollT > flower_admire){
        $("#flower_admire").addClass("animated fadeInUp show").removeClass("fade");
        setTimeout(Classflower_admire,200)
    }
    function Classflower_admire(){
        $(".flower_admire").addClass("animated fadeInUp show").removeClass("fade");
        setTimeout(Classflower_admire1,500)
    }
    function Classflower_admire1(){
        $(".flower_admire1").addClass("animated fadeInUp show").removeClass("fade");
    }

    if(scrollT > flower_intro){
        $("#flower_intro").addClass("animated fadeInUp show").removeClass("fade");
        setTimeout(Classflower_intro,100)
    }
    function Classflower_intro(){
        $(".flower_intro1").addClass("animated fadeInLeft show").removeClass("fade");
        $(".flower_intro2").addClass("animated fadeInRight show").removeClass("fade");
    }

    if(scrollT > new_flower){
        $("#new_flower").addClass("animated fadeInUp show").removeClass("fade");
        setTimeout(ClassNew_flower,300)
    }
    function ClassNew_flower(){
        $(".new_flower1").addClass("animated fadeInLeft show").removeClass("fade");
        $(".new_flower3").addClass("animated fadeInRight show").removeClass("fade");
        $(".new_flower4").addClass("animated fadeInUp show").removeClass("fade");
    }

    if(scrollT > contact_us){
        $("#contact_us").addClass("animated fadeInUp show").removeClass("fade");
        setTimeout(ClassContact_us,400)
    }
    function ClassContact_us(){
        $(".contact_us1").addClass("animated flipInX show").removeClass("fade");
        $(".send_message1").addClass("animated flipInY show").removeClass("fade");
        $(".join_us1").addClass("animated flipInY show").removeClass("fade");

    }

});