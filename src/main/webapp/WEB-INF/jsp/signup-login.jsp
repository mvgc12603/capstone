<jsp:include page="include/header.jsp"/>

<link rel="stylesheet" href="/assets/css/signup-login.css">


<script>
    function openForm() {
        document.getElementById("myForm").style.display = "block";
            document.getElementById("myForm2").style.display = "none";
    }

    function openForm2() {
        document.getElementById("myForm2").style.display = "block";
        document.getElementById("myForm").style.display = "none";
    }

</script>


<div id="main-wrapper" class="container" style="background: #467678;padding-top: 3rem">
    <div class="row justify-content-center" style="background: violet">
        <div class="col-xl-10" style="background: lightgoldenrodyellow">
            <div class="card-body p-0" style="background: #a3d4f6">
                <div class="row no-gutters" style="background: darkseagreen">
                    <div class="col-6 form-container" style="background: #eab29c"> <!-- Add margin-right here -->

                        <div class="p-5">
                            <div class="mb-5">
                                <h2 class="font-weight-bold text-theme">Sign Up</h2>
                            </div>
                            <p class="text-muted mt-2 mb-5"></p>

                            <form>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail1">
                                </div>
                                <div class="form-group mb-5">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1">
                                </div>
                                <button type="submit" class="btn btn-theme">Sign Up</button>
                                <button type="button" class="btn cancel" onclick="closeForm2()">Close</button>
                            </form>
                        </div>
                        <p class="text-muted text-center mt-3 mb-0">Have an account? <a href="" class="text-primary ml-1" onclick="openForm2()">register</a>
                    </div>
                    <div class="col-6 pl-3 form-container" style="background: #9ceaea"> <!-- Change this line -->
                        <div class="p-5">
                            <div class="mb-5">
                                <h2 class="font-weight-bold text-theme">Login</h2>
                            </div>

                            <p class="text-muted mt-2 mb-5">Log in by entering your email address and password.</p>

                            <form>
                                <div class="form-group">
                                    <label for="exampleInputEmail2">Email address</label>
                                    <input type="email" class="form-control" id="exampleInputEmail2">
                                </div>
                                <div class="form-group mb-5">
                                    <label for="exampleInputPassword2">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword2">
                                </div>
                                <button type="submit" class="btn btn-theme">Login</button>
                                <a href="#" class="forgot-link float-right text-primary">Forgot password?</a>
                                <button type="button" class="btn cancel" onclick="closeForm2()">Close</button>
                            </form>
                        </div>
                        <p class="text-muted text-center mt-3 mb-0">Don't have an account? <a href=""
                                                                                              class="text-primary ml-1"
                                                                                              onclick="openForm()">register</a>
                 </div>
                    </div>
                    <!-- end card-body -->
                </div>
                <!-- end card -->
                </p>

                <!-- end row -->

            </div>
            <!-- end col -->

        </div>
        <!-- Row -->
    </div>
</div>
