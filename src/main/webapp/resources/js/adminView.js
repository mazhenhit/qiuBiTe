$(function() {

    $('#side-menu').metisMenu();

});

//Loads the correct sidebar on window load,
//collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size
$(function() {
    $(window).bind("load resize", function() {
        topOffset = 50;
        width = (this.window.innerWidth > 0) ? this.window.innerWidth : this.screen.width;
        if (width < 768) {
            $('div.navbar-collapse').addClass('collapse');
            topOffset = 100; // 2-row-menu
        } else {
            $('div.navbar-collapse').removeClass('collapse');
        }

        height = ((this.window.innerHeight > 0) ? this.window.innerHeight : this.screen.height) - 1;
        height = height - topOffset;
        if (height < 1) height = 1;
        if (height > topOffset) {
            $("#page-wrapper").css("min-height", (height) + "px");
        }
    });

    var url = window.location;
    var element = $('ul.nav a').filter(function() {
        return this.href == url || url.href.indexOf(this.href) == 0;
    }).addClass('active').parent().parent().addClass('in').parent();
    if (element.is('li')) {
        element.addClass('active');
    }
});


$(function(){
	$('#backToTop').fadeOut(200);
	$(window).scroll(function(){
		var top = $(document).scrollTop();
		if(top>100)
			$('#backToTop').fadeIn(300);
		if(top<100)
			$('#backToTop').fadeOut(200);
	});
	
	$('#backToTop').click(function(){
		$('html,body').animate({scrollTop:0},500);
	});
});

function dateDiff(startTm, endTm){
	var startDate = new Date(startTm);
	var endDate = new Date(endTm);
	var diff = endDate.getTime() - startDate.getTime();
	var diffSecond = parseInt(diff/1000);
	var dateDiff = {day:null,hour:null,minute:null,second:null};
	dateDiff.day = Math.floor(diffSecond/(60*60*24));
	dateDiff.hour = Math.floor((diffSecond - dateDiff.day*24*60*60)/3600);
	dateDiff.minute = Math.floor((diffSecond - dateDiff.day*24*60*60 - dateDiff.hour*3600)/60);
	dateDiff.second = Math.floor(diffSecond - dateDiff.day*24*60*60 - dateDiff.hour*3600 - dateDiff.minute*60);
	return dateDiff;
}

//class带int-num-only的input只能输入整数
function intNumOnly(flag) {
	var regInt = /^[0-9]+$/;
	$('input[class~="int-num-only"]').each(function(){
		var val = $(this).val();
		if(""!=val&&!(regInt.test(val))){
			flag = false;
			$('#'+$(this).attr('name')+'Tip').html("<span class='icon-remove-sign'></span> 格式有误,整数或不填");
		}
	});
	return flag;
}

//class带money-only的input只能输入两位小数的金额
function moneyOnly(flag){
	var regFloat2 = /^[0-9]+[\.][0-9]{0,2}$/;
	var regInt = /^[0-9]+$/;
	$('input[class~="money-only"]').each(function(){
		var val = $(this).val();
		if(""!=val&&!(regFloat2.test(val)||regInt.test(val))){
			flag = false;
			$('#'+$(this).attr('name')+'Tip').html("<span class='icon-remove-sign'></span> 格式有误,两位小数或整数或不填");
		}
	});
	return flag;
}

//淡入淡出
function flexInfo(str){
	$('<div class="flex-info">'+str+'</div>').appendTo('body');
	$('.flex-info').delay(1000).fadeOut("slow",function(){
		$(this).remove();
	});
}

//js加法，解决精度的坑
function jsAdd(arg1,arg2){
    var r1,r2,m;
    try{r1=arg1.toString().split(".")[1].length}catch(e){r1=0}
    try{r2=arg2.toString().split(".")[1].length}catch(e){r2=0}
    m=Math.pow(10,Math.max(r1,r2))
    return (arg1*m+arg2*m)/m
}