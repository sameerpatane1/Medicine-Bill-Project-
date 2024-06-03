<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <link rel="stylesheet" href="CSS/adminstyle.css">
 
</head>

<body>
 
    <div class="row">
      <nav class="navbar navbar-expand-lg navbar-light bg-primary ">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="img/medicinelogo.jpg" style="width: 100px; height: 70px;"> <b style="color: darkorange;">Swami Pharma</b>
          </a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#" style="color: white;">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#" style="color: white;">About</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#" style="color: white;">Collection</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
                  aria-expanded="false" style="color: white;">
                 Services
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="addmedicine.jsp">Add Company Names</a></li>
               <li><a class="dropdown-item" href="viewmedicinename.jsp">view</a></li>
                  <li><a class="dropdown-item" href="addretailer.jsp">Add Retailer Details</a></li>
                   <li><a class="dropdown-item" href="retailerview.jsp">View Retailer Details</a></li>
                  <li><a class="dropdown-item" href="#">CompanyWise Medicines</a></li>
                 
                  <li><a class="dropdown-item" href="#">Stock</a></li>
                </ul>
              </li>
             
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown"
                  aria-expanded="false" style="color: white;">
                 Help
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Software Issue</a></li>
                  <li><a class="dropdown-item" href="#">Contact us</a></li>
                  
                  <li><a class="dropdown-item" href="loginpage.jsp">Login</a></li>
                </ul>
              </li> 
            </ul>
            <form class="d-flex">
              <input class="form-control" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-danger" type="submit" >Search</button>
            </form>
          </div>
        
      </nav>
    </div>
  </div>
  <!--coursel-->
 
    <div class="row">
      <div class="col-md-12">
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
          <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
              aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
              aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
              aria-label="Slide 3"></button>
          </div>
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="img/doctor-nurses-special-equipment.jpg" class="d-block w-100" alt="...">
              <div class="carousel-caption d-none d-md-block">
                <h3 style="color: darkmagenta;"><b> The Vital Importance of Medicine</b></h3>
                <p style="color: black;">Medicine is essential for safeguarding public health, combating diseases, and prolonging life expectancy, contributing to societal well-being. By providing relief from pain and managing chronic conditions, it enhances individuals' quality of life and productivity. </p>
              </div>
            </div>
            <div class="carousel-item">
              <img src="img/packings-pills-capsules-medicines.jpg" class="d-block w-100" alt="...">
              <div class="carousel-caption d-none d-md-block">
                <h3 style="color: darkmagenta;"><b>The Critical Role of Medicine in Society</b></h3>
                <p style="color: black;">Medicine serves as a beacon of hope, offering healing and relief from ailments that afflict humanity, thus nurturing the essence of compassion and empathy within society. Through preventive care and early intervention, it not only saves lives but also empowers individuals to lead fulfilling and productive lives, ensuring the continuity of families and communities.</p>
              </div>
            </div>
            <div class="carousel-item">
              <img src="img/high-angle-shopping-cart-with-pill-foils.jpg" class="d-block w-100" alt="...">
              <div class="carousel-caption d-none d-md-block">
                <h3 style="color: darkmagenta;"><b> Pillar of Human Flourishing</b></h3>
                <p style="color: black;">Medicine is the cornerstone of a thriving society, providing the foundation for physical well-being, mental health, and social cohesion. By alleviating suffering and restoring vitality, it enables individuals to pursue their dreams and contribute meaningfully to their communities. Through education and access, medicine empowers people to take control of their health, fostering a culture of self-care and resilience. </p>
              </div>
            </div>
          </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
            data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
            data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
      </div>

    

  </div>
  <br>
  <!--Cards-->
  <div class="container-fluid">
    <div class="row">

      <div class="col-md-4">
        <div class="card" style="width: 22rem;">
          <img src="img/medicines-palm-hand.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">Understanding the Microbiome</h5>
            <p class="card-text"> The gut microbiome consists of diverse bacteria, viruses, fungi, and other microorganisms that inhabit the digestive tract. These microbes interact with each other and with the host, forming a complex ecosystem influencing everything from digestion to immunity to mental well-being.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card" style="width: 22rem;">
         <img src="img/red-white-pills.jpg" class="card-img-top" alt="...">

          <div class="card-body">
            <h5 class="card-title">Immune System Regulation</h5>
            <p class="card-text">The gut microbiome plays a pivotal role in training and modulating the immune system. It helps distinguish between harmful pathogens and beneficial microbes, thus promoting immune tolerance and preventing inappropriate immune responses, such as allergies and autoimmune diseases.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card" style="width: 22rem;">
         <img src="img/medicine-capsules-global-health-with-geometric-pattern-digital-remix.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">Mental Health Connections</h5>
            <p class="card-text"> Emerging research suggests a strong link between the gut microbiome and mental health. The gut-brain axis, a bidirectional communication network between the gut and the brain, allows the microbiome to influence mood, behavior, and cognitive function.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
          </div>
        </div>
      </div>

  

    </div>
  </div>
  <br>
<!--form-->
  <div class="container-fluid">
    <div class="row">
      <div class="col-md-12 ">
        <center>
        <caption><h2 style="margin: 10px;">Patient Form</h2></caption>
      </center>
        <form class="row g-3">
          <div class="col-6">
            <label for="inputAddress2" class="form-label">Enter First Name</label>
            <input type="text" class="form-control" id="inputAddress2" placeholder="sameer">
          </div>
          <div class="col-md-6">
            <label for="inputEmail4" class="form-label">Enter a Last Name</label>
            <input type="email" class="form-control" id="inputEmail4"  placeholder="patane">
          </div>
          <div class="col-12">
            <label for="inputAddress" class="form-label">Address</label>
            <input type="text" class="form-control" id="inputAddress" placeholder="Current Address">
          </div>
          <div class="col-12">
            <label for="inputAddress2" class="form-label">Contact</label>
            <input type="text" class="form-control" id="inputAddress2" placeholder="9011587014">
          </div>
          <div class="col-md-6">
            <label for="inputCity" class="form-label">City</label>
            <input type="text" class="form-control" id="pune"  placeholder="pune">
          </div>
          <div class="col-md-4">
            <label for="inputState" class="form-label">State</label>
            <select id="inputState" class="form-select">
              <option selected>Choose...</option>
              <option>Maharashtra</option>
              <option>UP</option>
              <option>Panjab</option>
              <option>Gujrat</option>
            </select>
          </div>
          <div class="col-md-2">
            <label for="inputZip" class="form-label">Pincode</label>
            <input type="text" class="form-control" id="inputZip"  placeholder="412206">
          </div>
          <div class="col-12">
            <div class="form-check">
              <input class="form-check-input" type="checkbox" id="gridCheck">
              <label class="form-check-label" for="gridCheck">
                Check me out
              </label>
            </div>
          </div>
          <div class="col-md-12">
            <button type="submit" class="btn btn-primary" >Submit</button>
            
          </div>             
          </div>
        </form>
      </div>
    </div>
  </div><br>
  <!--footer-->
  <div class="container-fluid">
    <div class="row">
      <div class="col-md-12">
        <footer class="bg-dark text-light py-3">
          <div class="container">
            <div class="row">
              <div class="col-md-5">
                <h5>About Us</h5>
                <p>
                  Welcome to Swami pharma, where innovation meets healthcare. We are a cutting-edge medical software company dedicated to revolutionizing the way healthcare professionals deliver patient care. Our mission is to empower healthcare providers with advanced technological solutions that streamline workflows, improve patient outcomes, and enhance overall efficiency in the healthcare industry.</p>
              </div>
              <div class="col-md-4">
                <h5>Quick Links</h5>
                <ul class="list-unstyled">
                  <li><a href="#">Home</a></li>
                  <li><a href="#">Services</a></li>
                  <li><a href="#">Products</a></li>
                  <li><a href="#">Contact</a></li>
                </ul>
              </div>
              <div class="col-md-3">
                <h5>Contact Us</h5>
                <address>
                  <strong>Swami Pharma</strong><br>
                  At Dhawadi, Tel Bhor, Dist Pune<br>
                 India<br>
                  <abbr title="Phone">P:</abbr> +919011587014
                <a href="https://maps.app.goo.gl/9NjY3kwBWP7As4599">Location</a>
                </address>
              </div>
            </div>
            <hr>
            <div class="text-center">
              <p>&copy; 2024 Your Company. All rights reserved.</p>
              <p>Designed  <i class="bi bi-heart-fill text-danger"></i> by <a href="#">sameer</a></p>
            </div>
          </div>
        </footer>
      </div>
    </div>

  </div>
  
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
    crossorigin="anonymous"></script>
</body>

</html>