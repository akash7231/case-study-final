<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img 
{
      width:200px;height:200px;
      margin: auto;
  }

div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;

    text-align: center;
	font-size: 26px;	
}

nav {
    background-color:	#FF9933;
    float: left;
    max-width: 300px;
    height:700px;
    margin: 0;
    padding: 1em;
}


article {
    background-color:	#d3d3d3;
    margin-left: 100px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}

.button {
	background-color : black;
	border : none;
	color : white;
	padding : 15px 32px;
	text-align : center;
	display : inline-block;
	font-size : 15px;
	margin : 4px 2px;
	cursor : pointer; 
}

</style>
</head>
<body>

<div class="container">

<header>
  
   <img src="techm.jpg" alt="TechMahindra" height="100" width="250">
   EMPLOYEE ALLOTMENT PROCESSING
</header>

  
<nav>
	 <!-- <img src="mypic.jpg"  style="float:center;width:200px;height:200px;"> -->
<a href="Login.html" class="button">Login</a>
<br><br>
<!-- <a href="registration.html" class="button">Registration</a>  -->

</nav>

<article>
  <div class="container">

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="techm3.jpg" alt="TechMahindra" style="width:100%; height:300%">
        <div class="carousel-caption">
         
        </div>
      </div>

      <div class="item">
        <img src="techm2.jpg" alt="TechMahindra" style="width:100%; height:400%">
        <div class="carousel-caption">

        </div>
      </div>
    
      <div class="item">
        <img src="techm1.JPG" alt="TechMahindra" style="width:100%; height:300%">
        <div class="carousel-caption">
   
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</article>

<footer>&copy;TechMahindra</footer>
</div>
</body>
</html>