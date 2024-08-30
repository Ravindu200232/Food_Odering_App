<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <!-- Important to make website responsive -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>

    <!-- Link our CSS file -->
    <link rel="stylesheet" href="homestyle.css">
</head>

<body>
    <!-- Navbar Section Starts Here -->
    <section class="navbar">
        <div class="container">
            <div class="logo">
                <a href="#" title="Logo">
                    <img src="images/logo.png" alt="Restaurant Logo" class="img-responsive">
                </a>
            </div>

            <div class="menu text-right">
                <ul>
                    <li>
                        <a href="index.html">Home</a>
                    </li>
                    <li>
                        <a href="categories.html">Categories</a>
                    </li>
                    <li>
                        <a href="foods.html">Foods</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>

            <div class="clearfix"></div>
        </div>
    </section>
    <!-- Navbar Section Ends Here -->

    <!-- fOOD sEARCH Section Starts Here -->
    <section class="food-search">
        <div class="container">
            
            <h2 class="text-center text-white">Fill this form to confirm your order.</h2>

            <form action="insertbook"   method="post"  class="order">
                <fieldset>
                    <legend>Selected Food</legend>
                    
                    <div class="food-menu-img">
                        <img src="images/menu-pizza.jpg" alt="Chicke Hawain Pizza" class="img-responsive img-curve">
                    </div>
    
                    <div class="food-menu-desc">
                        <h3>Food Title</h3>
                        <select name="fType" id="fType" class="input-responsive">
                    <option value="dqcsb">Dairy Queen Chicken Strip Basket</b></option>
                    <option value="ps">Panera Soup</option>
                    <option value="hot">Hardee's Original Thickburger</option>
                    <option value="mfs">McDonald's Filet-O-Fish Sandwich</option>
                    <option value="Pizza">Little Caesars Crazy Bread</option>
                    <option value="kecc">KFC Extra Crispy Chicken</option>
                    <option value="cwcc">Culver's Wisconsin Cheese Curds</option>
                    <option value="fgf">Five Guys Fries</option>
                    <option value="wbp">Wendy's Baked Potato</option>
                    <option value="ljstfm">Long John Silver's Two-Piece Fish Meal</option>
                    <option value="bkcf">Burger King Chicken Fries</option>
                    <option value="kpcn">KFC Popcorn Chicken Nuggets</option>
                    <option value="dm">Dunkin' Munchkins</option>
                    <option value="sc">Subway Cookies</option>
                    <option value="cfait">Chick-fil-A Iced Tea</option>
                    <option value="mbap">McDonald's Baked Apple Pie</option>
                    <option value="sm">Starbucks Macchiato</option>
                    <option value="kmpwg">KFC Mashed Potatoes with Gravy</option>
                    <option value="sssb">Shake Shack SmokeShack Burger</option>
                    <option value="bkff">Burger King French Fries</option>
                    <option value="scbrm">Subway Chicken & Bacon Ranch Melt</option>
                  
                    
                    </select>
                        
                        

                        <div class="order-label">Quantity</div>
                        <input type="number" name="qty" class="input-responsive" value="1" required>
                        
                    </div>

                </fieldset>
                
                <fieldset>
                    <legend>Delivery Details</legend>
                    <div class="order-label">Full Name</div>
                    <input type="text" name="bname" placeholder="E.g. Ravindu Bandara" class="input-responsive" required>

                    <div class="order-label">Phone Number</div>
                    <input type="tel" name="bphone" placeholder="E.g. 07130xxxxxx" class="input-responsive" required>

                    <div class="order-label">Email</div>
                    <input type="email" name="bemail" placeholder="E.g. ravi@gmail.com" class="input-responsive" required>

                    <div class="order-label">Address</div>
                    <textarea name="baddress" rows="10" placeholder="E.g. Street, City, Country" class="input-responsive" required></textarea>

                    <input type="submit" name="submit" value="Confirm Order" class="btn btn-primary">
                </fieldset>

            </form>

        </div>
    </section>
    <!-- fOOD sEARCH Section Ends Here -->

    <!-- social Section Starts Here -->
    <section class="social">
        <div class="container text-center">
            <ul>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/50/000000/facebook-new.png"/></a>
                </li>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/48/000000/instagram-new.png"/></a>
                </li>
                <li>
                    <a href="#"><img src="https://img.icons8.com/fluent/48/000000/twitter.png"/></a>
                </li>
            </ul>
        </div>
    </section>
    <!-- social Section Ends Here -->

    <!-- footer Section Starts Here -->
    <section class="footer">
        <div class="container text-center">
            <p>All rights reserved. Designed By <a href="#">Ravindu</a></p>
        </div>
    </section>
    <!-- footer Section Ends Here -->

</body>
</html>