<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="include/header.jsp"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Form</title>
    <link rel="stylesheet" href="/assets/css/contact.css" />
</head>
<body>
<div class="container contact-container">
    <span class="big-circle"></span>
    <img src="img/shape.png" class="square" alt="" />
    <div class="info-container">
        <div class="contact-info">
            <h3 class="title">Let's get in touch</h3>
            <p class="text">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Saepe
                dolorum adipisci recusandae praesentium dicta!
            </p>

            <div class="info">
                <div class="information">

                    <p>92 Cherry Drive Uniondale, NY 11553</p>
                </div>
                <div class="information">
                    <i class="fas fa-envelope"></i> &nbsp &nbsp
                    <p>lorem@ipsum.com</p>
                </div>
                <div class="information">
                    <i class="fas fa-phone"></i>&nbsp&nbsp
                    <p>123-456-789</p>
                </div>
            </div>

            </div>
        </div>

<script>
    const txtContainers = document.getElementsByClassName("contact-form");
    const imgContainers = document.getElementsByClassName("info-container");

    imgContainers[i].style.height = txtContainers[i].clientHeight + 'px';
</script>
        <div class="contact-form">
            <span class="circle one"></span>
            <span class="circle two"></span>

            <form action="index.html" autocomplete="off">
                <h3 class="title">Contact us</h3>
                <div class="input-container">
                    <input type="text" name="name" class="input" />
                    <label>Name</label>
                    <span>Name</span>
                </div>
                <div class="input-container">
                    <input type="email" name="email" class="input" />
                    <label>Email*</label>
                    <span>Email</span>
                </div>
                <div class="input-container">
                    <input type="tel" name="phone" class="input" />
                    <label>Phone</label>
                    <span>Phone</span>
                </div>
                <fieldset>
                    <legend>Select your preferred contact method:</legend>
                    <div>
                        <input type="radio" id="contactChoice1" name="contact" value="email" />
                        <label for="contactChoice1">Email</label>
                        <input type="radio" id="contactChoice2" name="contact" value="phone" />
                        <label for="contactChoice2">Phone</label>
                    </div>
                </fieldset>
                <div class="input-container">
                    <input type="text" name="community" class="input" maxlength="40"/>
                    <label>Community Name*</label>
                    <span>Community Name</span>
                </div>
                <div class="input-container">
                    <input type="text" name="role" class="input" maxlength="30">
                    <label>Role*</label>
                    <span>Role</span>
                </div>
                <div class="input-container textarea">
                    <textarea name="message" class="input"></textarea>
                    <label>Message*</label>
                    <span>Message</span>
                </div>
                <label for="speakerId" class="col-form-label">
                    If interested in a speaker, please select from the following:
                </label>
                <div class="input-container">
                    <select id="speakerId" name="speakerId" class="form-select">
                        <option disabled selected value>-- Select a Speaker --</option>
                        <c:forEach items="${speakers}" var="speaker">
                            <option value="${speaker.id}">${speaker.firstName} ${speaker.lastName}</option>
                        </c:forEach>
                    </select>
                </div>
                <input type="submit" value="Send" class="btn submit-button" />
            </form>
        </div>
    </div>

</body>
</html>

