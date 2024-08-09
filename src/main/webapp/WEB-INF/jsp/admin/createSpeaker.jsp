<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Speaker</h1>
        </div>
    </div>
</section>

<section class="container">

    <form action="/createSpeaker" method="post"
          enctype="multipart/form-data">
                             <%--        CHANGE THIS ACTION --%>
        <input type="hidden" name="id" value="${form.id}">
        <div class="row">
            <div class="col-6">
                <div class="form-group">
                    <label for="firstname">Firstname</label>
                    <input type="text" id="firstname" name="name" value="${form.firstName}"
                           placeholder="" class="form-control">
                </div>
            </div>
            <div class="col-6">
                <div class="form-group">
                    <label for="lastname">Lastname</label>
                    <input type="text" id="lastname" name="name" value="${form.lastName}"
                           placeholder="" class="form-control">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="form-group">
                    <label for="organization">Organization</label>
                    <input type="text" id="organization" name="organization" value="${form.organization}"
                           placeholder="" class="form-control">
                </div>
            </div>
            <div class="col-8">
                <div class="form-group">
                    <label for="speakerImg">Profile Image</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">../pub/assets/img/speakers/</span>
                        </div>
                        <input type="text" id="speakerImg" name="speakerImg" value="${form.imageURL}"
                               class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" id="title" name="title" value="${form.title}"
                           placeholder="" class="form-control">
                </div>
            </div>

            <div class="col-8">
                <div class="form-group" style="padding-left: 1rem;">
                    <label for="about">About</label>
                    <textarea id="about" name="about"
                              value="${form.about}"
                              placeholder="" class="form-control">${form.about}</textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="submit">
                <button type="submit" class="btn submit-btn">Submit</button>
            </div>
        </div>
    </form>
</section>

<style>
    form {
        font-family: "Blogger Sans";
        letter-spacing: 1px;
    }

    .row {
        margin: 2rem;
    }


    .form-check input {
        margin-right: 0.6rem;
    }

    .submit {
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .submit-btn {
        background-color: rgb(216, 67, 67);
        color: rgb(243, 242, 232);
        align-self: flex-end;
        min-width: 200px;
    }

    .submit-btn:hover {
        background-color: #e16d6d;
        color: white;
    }


</style>
<jsp:include page="../include/footer.jsp"/>