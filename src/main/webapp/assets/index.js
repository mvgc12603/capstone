//
//     function showLoginForm() {
//     document.getElementById("signup").style.display = "none";
//     document.getElementById("login").style.display = "grid";
// }
//
//     function showSignupForm() {
//     document.getElementById("signup").style.display = "grid";
//     document.getElementById("login").style.display = "none";
// }

$('#recipeCarousel').carousel({
    interval: 10000
})

$('.carousel .carousel-item').each(function(){
    var minPerSlide = 3;
    var next = $(this).next();
    if (!next.length) {
        next = $(this).siblings(':first');
    }
    next.children(':first-child').clone().appendTo($(this));

    for (var i=0;i<minPerSlide;i++) {
        next=next.next();
        if (!next.length) {
            next = $(this).siblings(':first');
        }

        next.children(':first-child').clone().appendTo($(this));
    }
});


