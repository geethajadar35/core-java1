class SuperMarket {

    public static String[] searchBrandByProduct(String productName) {

        if (productName=="Biscuit") {
            String[] biscuitBrands = {
        "Parle-G", "Britannia Good Day", "Britannia Marie Gold",
        "Oreo", "Hide & Seek", "Bourbon",
        "Monaco", "Little Hearts", "Tiger",
        "50-50", "Krackjack", "Dark Fantasy",
        "Milk Bikis", "Nice Time", "Jim Jam",
        "Treat Croissant", "Sunfeast Mom's Magic",
        "Sunfeast Dark Fantasy", "Unibic Cookies",
        "Priyagold Butter Bite", "Priyagold CNC",
        "McVitie's Digestive", "Milano",
        "NutriChoice", "Anmol Marie",
        "Dukes Waffy", "Dukes Creams",
        "Bisk Farm", "Dukes Bourbon",
        "Oreo Golden", "Oreo Strawberry",
        "Britannia Little Hearts", "Britannia Bourbon",
        "Britannia Milk Bikis", "Britannia 50-50",
        "Sunfeast Marie Light", "Sunfeast Glucose"
        };
		System.out.println("Biscuit Brands are : "+"\n");
            return biscuitBrands;
        }

         if (productName=="Shampoo") {
            String[] shampooBrands = {
         "Clinic Plus", "Sunsilk", "Dove",
         "Head & Shoulders", "Pantene",
         "L'Oreal Paris", "TRESemme",
         "Himalaya", "Indulekha",
         "Meera", "Garnier Fructis",
         "Biotique", "Mamaearth",
         "WOW Skin Science", "Khadi Natural",
         "Patanjali Kesh Kanti", "Herbal Essences",
         "Johnson's Baby", "Vatika",
         "Matrix", "Streax",
         "Livon", "Schwarzkopf",
         "Clinic All Clear", "Rejoice",
         "Nyle", "Park Avenue",
         "Fiama", "Enliven",
         "Tresemme Keratin", "Dove Intense Repair",
         "Pantene Hairfall Control", "Sunsilk Black Shine",
         "Head & Shoulders Cool Menthol",
         "Himalaya Anti Hair Fall",
         "L'Oreal Total Repair 5",
         "Garnier Ultra Blends"
        };
		System.out.println("\n"+"Shampoo Brands are : "+"\n");
            return shampooBrands;
        }
		
		if (productName=="Soap") {
			String[] soapBrands = {
		"Lux", "Lifebuoy", "Dove",
		"Pears", "Medimix", "Cinthol",
		"Hamam", "Santoor", "Dettol",
		"Mysore Sandal", "Godrej No.1", "Fiama",
		"Vivel", "Liril", "Himalaya Neem",
		"Patanjali Kanti", "Johnson's Baby Soap",
		"Chandrika", "Margo", "Nivea",
		"Savlon", "Khadi Soap",
		"Biotique Basil", "Medimix Ayurvedic",
		"Cinthol Lime", "Lux Velvet",
		"Lifebuoy Total", "Dove Cream Beauty",
		"Pears Pure", "Hamam Neem",
		"Santoor Sandal", "Dettol Skincare",
		"Godrej Sandal", "Fiama Gel Bar",
		"Vivel Aloe", "Liril Lime",
		"Mysore Sandal Gold"
		};
		System.out.println("\n"+"Soap Brands are : "+"\n");
			return soapBrands;
		}
			
		if (productName=="Toothpaste") {
			String[] toothpasteBrands = {
        "Colgate Strong Teeth", "Colgate MaxFresh", "Colgate Visible White",
        "Pepsodent", "Closeup", "Sensodyne",
        "Dabur Red", "Patanjali Dant Kanti", "Meswak",
        "Vicco Vajradanti", "Himalaya Complete Care",
        "Oral-B", "Aquafresh",
        "Colgate Herbal", "Colgate Salt",
        "Pepsodent Germicheck", "Closeup Everfresh",
        "Sensodyne Rapid Relief", "Dabur Meswak",
        "Patanjali Advanced", "Vicco Sugar Free",
        "Himalaya Sparkling White", "Oral-B Pro Health",
        "Aquafresh Fresh Mint",
        "Colgate Total", "Colgate Kids",
        "Pepsodent Expert", "Closeup Red Hot",
        "Sensodyne Repair", "Dabur Babool",
        "Patanjali Neem", "Vicco Turmeric",
        "Himalaya Neem", "Oral-B Gum Care",
        "Aquafresh Whitening", "Colgate Active Salt",
        "Colgate Charcoal"
		};
		System.out.println("\n"+"Toothpaste Brands are :"+"\n");
			return toothpasteBrands;
		}
		
		
		if (productName=="CookingOil") {
			String[] oilBrands = {
        "Fortune Sunflower", "Fortune Rice Bran", "Saffola Gold",
        "Saffola Active", "Dhara Refined", "Gemini Sunflower",
        "Freedom Refined", "Gold Winner", "Sunpure",
        "Nature Fresh", "Engine Mustard", "Patanjali Mustard",
        "Dalda Refined", "Aadhar Oil", "VVD Gold",
        "Saffola Tasty", "Fortune Mustard",
        "Dhara Mustard", "Gemini Rice Bran",
        "Freedom Groundnut", "Gold Winner Refined",
        "Sunpure Groundnut", "Nature Fresh Acti",
        "Engine Groundnut", "Patanjali Sunflower",
        "Dalda Mustard", "Aadhar Sunflower",
        "VVD Coconut Oil", "Saffola Total",
        "Fortune Groundnut", "Dhara Groundnut",
        "Gemini Groundnut", "Freedom Sunflower",
        "Gold Winner Sunflower", "Sunpure Sunflower",
        "Nature Fresh Rice Bran", "Engine Sunflower"
		};
		System.out.println("\n"+"CookingOil are :"+"\n");
			return oilBrands;
		}


		if (productName=="Milk") {
			String[] milkBrands = {
        "Amul Gold", "Amul Taaza", "Amul Shakti",
        "Nandini GoodLife", "Nandini Special",
        "Heritage Milk", "Dodla Milk", "Mother Dairy",
        "Arokya Milk", "Vijaya Milk",
        "Milma Milk", "Gokul Milk",
        "Amul Slim", "Nandini Toned",
        "Heritage Toned", "Dodla Full Cream",
        "Mother Dairy Full Cream", "Arokya Full Cream",
        "Vijaya Full Cream", "Milma Toned",
        "Gokul Toned", "Amul Cow Milk",
        "Nandini Double Toned", "Heritage Full Cream",
        "Dodla Toned", "Mother Dairy Toned",
        "Arokya Standard", "Vijaya Toned",
        "Milma Full Cream", "Gokul Full Cream",
        "Amul Lactose Free", "Nandini Homogenized",
        "Heritage Standard", "Dodla Standard",
        "Mother Dairy Slim", "Arokya Lite",
        "Vijaya Standard"
		};
		System.out.println("\n"+"Milk Brands are :"+"\n");
			return milkBrands;
		}

		if (productName=="Rice") {
			String[] riceBrands = {
        "India Gate Basmati", "Daawat Basmati", "Kohinoor Basmati",
        "Fortune Biryani Special", "Fortune Everyday", "Lal Qilla Basmati",
        "Tilda Basmati", "Aeroplane Basmati", "24 Mantra Organic",
        "Patanjali Basmati", "Shakti Bhog", "Unity Basmati",
        "Zeeba Basmati", "Sri Lalitha Rice", "DRRK Basmati",
        "Amira Basmati", "Mother's Choice", "Crown Basmati",
        "Golden Harvest", "HMT Kolam", "Sona Masoori",
        "BPT Rice", "IR 64 Rice", "Kurnool Sona",
        "Rajamudi Rice", "Navara Rice", "Gobindobhog",
        "Ponmani Rice", "Aashirvaad Basmati", "Natureland Organic",
        "Organic India Rice", "BB Royal Rice", "Vedaka Basmati",
        "Sampoorna Rice", "Utsav Basmati", "Double Horse Rice",
        "Nirapara Rice"
		};
		System.out.println("\n"+"Rice Brands are :"+"\n");
		
			return riceBrands;
		}

		if (productName=="Chocolate") {
			String[] chocolateBrands = {
        "Dairy Milk", "Five Star", "KitKat",
        "Munch", "Perk", "Milkybar",
        "Bournville", "Silk", "Fuse",
        "Snickers", "Mars", "Galaxy",
        "Toblerone", "Ferrero Rocher", "Kinder Joy",
        "Hershey's", "Amul Dark", "Lindt",
        "Bounty", "Temptations", "Milano Choco",
        "Dairy Milk Crackle", "Silk Oreo", "KitKat Dark",
        "Five Star Oreo", "Munch Nuts", "Perk Double",
        "Milkybar Moosha", "Bournville Cranberry",
        "Snickers Peanut", "Mars Caramel", "Galaxy Smooth",
        "Toblerone White", "Ferrero Moments",
        "Kinder Bueno", "Hershey's Cookies", "Amul Fruit & Nut",
        "Lindt Excellence"
		};
		System.out.println("\n"+"Chocolate Brands are :"+"\n");
			return chocolateBrands;
		}

		if (productName=="Tea") {
			String[] teaBrands = {
        "Tata Tea Gold", "Tata Tea Premium", "Tata Tea Agni",
        "Red Label", "Brooke Bond Taj Mahal", "Wagh Bakri",
        "Society Tea", "Girnar Tea", "Tetley",
        "Lipton Green", "Twinings", "Organic India Tulsi",
        "Tata Tea Chakra Gold", "AVT Tea", "3 Roses",
        "Brooke Bond 3 Roses", "Marvel Tea", "Golden Tips",
        "Teabox", "Vahdam Tea", "Taj Mahal Gold",
        "Red Label Natural Care", "Wagh Bakri Premium",
        "Society Masala", "Girnar Masala",
        "Tetley Green", "Lipton Yellow Label",
        "Twinings Earl Grey", "Organic India Green",
        "AVT Premium", "3 Roses Natural Care",
        "Marvel Premium", "Golden Tips Darjeeling",
        "Teabox Assam", "Vahdam Green",
        "Tata Tea Elaichi", "Red Label Strong"
		};
		System.out.println("\n"+"Tea Brands are :"+"\n");
			return teaBrands;
		}

		if (productName=="Coffee") {
			String[] coffeeBrands = {
        "Nescafe Classic", "Nescafe Sunrise", "Bru Instant",
        "Bru Gold", "Tata Coffee Grand", "Continental Xtra",
        "Davidoff", "Blue Tokai", "Sleepy Owl",
        "Rage Coffee", "Levista", "Cothas",
        "Narasu's", "Leo Coffee", "Seven Beans",
        "Third Wave Coffee", "CCD Coffee", "Starbucks Instant",
        "Nescafe Gold", "Bru Green Label",
        "Tata Coffee Premium", "Continental Speciale",
        "Davidoff Rich Aroma", "Blue Tokai Attikan",
        "Sleepy Owl Cold Brew", "Rage Dark Roast",
        "Levista Classic", "Cothas Special Blend",
        "Narasu's Udhayam", "Leo Filter Coffee",
        "Seven Beans Urja", "Third Wave Vienna Roast",
        "CCD Special Blend", "Starbucks Pike Place",
        "Nescafe Intense", "Bru Exotica",
        "Tata Coffee Gold"
		};
		System.out.println("\n"+"Coffee Brands are :"+"\n");
			return coffeeBrands;
		}
		
		if (productName=="Refrigerator") {
			String[] refrigeratorBrands = {
        "LG Double Door", "Samsung Family Hub", "Whirlpool Intellifresh",
        "Godrej Edge Pro", "Haier Inverter", "Panasonic Econavi",
        "Bosch VitaFresh", "Siemens iQ300", "Hitachi French Door",
        "Voltas Beko", "Croma Frost Free", "Kelvinator Cool Pro",
        "Electrolux Neo Fresh", "Lloyd Inverter", "Midea Convertible",
        "Onida Smart Cool", "Sharp J-Tech", "BPL Direct Cool",
        "Mitashi Eco", "Hisense Bottom Freezer",
        "LG Side by Side", "Samsung Convertible",
        "Whirlpool Triple Door", "Godrej Eon",
        "Haier Glass Door", "Panasonic Prime",
        "Bosch MaxFlex", "Siemens Frost Free",
        "Hitachi Stylish Line", "Voltas Beko Neo",
        "Croma Convertible", "Kelvinator Frost Free",
        "Electrolux Ultimate", "Lloyd Glass Door",
        "Midea Multi Door", "Onida Inverter",
        "Sharp Premium"
		};
		System.out.println("\n"+"Refrigerator Brands are :"+"\n");
		return refrigeratorBrands;
		}
		
		if (productName=="AirConditioner") {
			String[] acBrands = {
        "LG Dual Inverter", "Samsung WindFree", "Daikin Split AC",
        "Voltas Adjustable", "Blue Star Inverter", "Hitachi iSense",
        "Carrier XPower", "Panasonic WiFi AC", "Whirlpool Magicool",
        "Godrej 5 Star", "Lloyd Inverter", "Haier Clean Cool",
        "Midea All Easy", "Onida Smart AC", "Toshiba Inverter",
        "Sharp Plasmacluster", "O General Split", "Hisense Smart AC",
        "Croma AC", "Mitashi Inverter",
        "LG Window AC", "Samsung Convertible",
        "Daikin FTKF Series", "Voltas Window AC",
        "Blue Star Fixed Speed", "Hitachi Window AC",
        "Carrier Split AC", "Panasonic Nanoe",
        "Whirlpool Inverter", "Godrej Inverter",
        "Lloyd Window AC", "Haier Inverter Plus",
        "Midea Window AC", "Onida Inverter Split",
        "Toshiba Smart AC", "Sharp Inverter AC",
        "O General Window AC"
		};
		System.out.println("\n"+"AirConditioner Brands are :"+"\n");
			return acBrands;
		}
		
		if (productName=="Laptop") {
			String[] laptopBrands = {
        "HP Pavilion", "HP Victus", "Dell Inspiron",
        "Dell XPS", "Lenovo IdeaPad", "Lenovo ThinkPad",
        "Asus VivoBook", "Asus ROG", "Acer Aspire",
        "Acer Nitro", "Apple MacBook Air", "Apple MacBook Pro",
        "MSI Modern", "MSI Gaming", "Samsung Galaxy Book",
        "LG Gram", "Microsoft Surface", "Razer Blade",
        "Honor MagicBook", "Infinix InBook",
        "HP Omen", "Dell Alienware",
        "Lenovo Legion", "Asus ZenBook",
        "Acer Swift", "Apple MacBook M3",
        "MSI Katana", "Samsung Book Flex",
        "LG Ultra PC", "Microsoft Surface Go",
        "Razer Blade 15", "Honor MagicBook X",
        "Infinix ZeroBook", "HP Chromebook",
        "Dell Latitude", "Lenovo Yoga",
        "Asus TUF Gaming"
		};
		System.out.println("\n"+"Laptop Brands are :"+"\n");
			return laptopBrands;
		}
		
		if (productName=="Television") {
			String[] tvBrands = {
        "Sony Bravia", "Samsung Crystal 4K", "LG OLED",
        "Mi Smart TV", "OnePlus Y Series", "TCL QLED",
        "Vu Premium", "Panasonic LED", "Philips Smart TV",
        "Haier 4K", "Thomson Android TV", "Kodak LED",
        "Onida Fire TV", "BPL Smart TV", "Croma TV",
        "Hisense 4K", "Realme Smart TV", "Motorola Revou",
        "Nokia Smart TV", "iFFALCON QLED",
        "Sony Google TV", "Samsung Neo QLED",
        "LG NanoCell", "Mi 5X Series",
        "OnePlus Q Series", "TCL Android TV",
        "Vu Cinema TV", "Panasonic 4K",
        "Philips Android TV", "Haier Bezel Less",
        "Thomson Oath Pro", "Kodak 4K",
        "Onida Android TV", "BPL 4K",
        "Croma 4K", "Hisense Android TV",
        "Realme 4K TV"
		};
		System.out.println("\n"+"Television Brands are :"+"\n");
			return tvBrands;
		}
		
		if (productName=="Shoes") {
			String[] shoeBrands = {
        "Nike Air Max", "Adidas Ultraboost", "Puma RS-X",
        "Reebok Classic", "Skechers Go Walk", "Bata Power",
        "Woodland Outdoor", "Red Chief Leather", "Campus Sneakers",
        "Sparx Running", "Asian Shoes", "Liberty Warrior",
        "Crocs Clogs", "Converse All Star", "Vans Old Skool",
        "New Balance 574", "Under Armour HOVR", "Fila Disruptor",
        "HRX Sneakers", "Lotto Sports",
        "Nike Revolution", "Adidas Superstar",
        "Puma Smash", "Reebok Zig",
        "Skechers Arch Fit", "Bata Formal",
        "Woodland Boots", "Red Chief Casual",
        "Campus Oxyfit", "Sparx Canvas",
        "Asian Wonder", "Liberty Gliders",
        "Crocs LiteRide", "Converse Chuck Taylor",
        "Vans Slip-On", "New Balance Fresh Foam",
        "Under Armour Charged"
		};
		System.out.println("\n"+"Shoes Brands are :"+"\n");
			return shoeBrands;
		}

		if (productName=="Atta") {
			String[] attaBrands = {
        "Aashirvaad Whole Wheat", "Pillsbury Chakki Fresh", "Fortune Chakki Fresh",
        "Annapurna Atta", "Nature Fresh Sampoorna", "Shakti Bhog Atta",
        "24 Mantra Organic Atta", "Patanjali Whole Wheat", "Organic India Atta",
        "BB Royal Atta", "Vedaka Atta", "Tata Sampann Atta",
        "Rajdhani Atta", "Laxmi Bhog Atta", "Double Horse Atta",
        "Golden Harvest Atta", "MP Sharbati Atta", "Hathi Chakki Atta",
        "Farm Fresh Atta", "Srestha Atta",
        "Aashirvaad Multigrain", "Pillsbury Multigrain",
        "Fortune Multigrain", "Annapurna Multigrain",
        "Nature Fresh Multigrain", "Shakti Bhog Multigrain",
        "24 Mantra Multigrain", "Patanjali Multigrain",
        "Organic Tattva Atta", "BB Popular Atta",
        "Vedaka Chakki Atta", "Tata Sampann Multigrain",
        "Rajdhani Multigrain", "Laxmi Bhog Multigrain",
        "Golden Harvest Multigrain", "MP Sharbati Gold",
        "Farm Fresh Multigrain"
		};
		System.out.println("\n"+"Atta Brands are :"+"\n");
			return attaBrands;
		}
		
		if (productName=="Sugar") {
			String[] sugarBrands = {
        "Madhur Sugar", "Dhampur Sugar", "Trust Sugar",
        "Uttam Sugar", "Parry's Sugar", "EID Parry",
        "Shree Renuka Sugar", "Bannari Amman Sugar", "Dwarikesh Sugar",
        "Balrampur Sugar", "Simbhaoli Sugar", "Triveni Sugar",
        "24 Mantra Organic Sugar", "Organic Tattva Sugar", "BB Royal Sugar",
        "Vedaka Sugar", "Fortune Sugar", "Natureland Organic Sugar",
        "Patanjali Sugar", "Tata Sampann Sugar",
        "Madhur Brown Sugar", "Dhampur Brown Sugar",
        "Trust Brown Sugar", "Uttam Brown Sugar",
        "Parry's Brown Sugar", "Renuka Brown Sugar",
        "Bannari Brown Sugar", "Dwarikesh Brown Sugar",
        "Balrampur Brown Sugar", "Sim bhaoli Brown",
        "Triveni Brown Sugar", "24 Mantra Brown Sugar",
        "Organic Tattva Brown", "BB Royal Brown",
        "Vedaka Brown Sugar", "Fortune Brown Sugar",
        "Natureland Brown Sugar"
		};
		System.out.println("\n"+"Sugar Brands are :"+"\n");
			return sugarBrands;
		}
		
		if (productName=="Salt") {
			String[] saltBrands = {
        "Tata Salt", "Tata Salt Lite", "Aashirvaad Salt",
        "Catch Salt", "Captain Cook Salt", "Annapurna Salt",
        "Saffola Salt", "Patanjali Salt", "Nirma Shudh Salt",
        "Sambhar Salt", "Indus Valley Salt", "BB Royal Salt",
        "Vedaka Salt", "Natureland Rock Salt", "24 Mantra Rock Salt",
        "Organic Tattva Salt", "Tata Rock Salt", "Sendha Namak",
        "Himalayan Pink Salt", "Tata Black Salt",
        "Catch Black Salt", "Aashirvaad Black Salt",
        "Captain Cook Rock Salt", "Annapurna Rock Salt",
        "Saffola Rock Salt", "Patanjali Rock Salt",
        "Nirma Rock Salt", "Sambhar Rock Salt",
        "Indus Valley Pink Salt", "BB Royal Rock Salt",
        "Vedaka Rock Salt", "Natureland Pink Salt",
        "24 Mantra Pink Salt", "Organic Tattva Pink",
        "Tata Iodized Salt", "Catch Iodized Salt",
        "Aashirvaad Iodized Salt"
		};
		System.out.println("\n"+"Salt Brands are :"+"\n");
			return saltBrands;
		}
		
		if (productName=="Turmeric") {
			String[] turmericBrands = {
        "Everest Turmeric", "MDH Haldi", "Catch Turmeric",
        "Tata Sampann Turmeric", "Aashirvaad Turmeric", "Badshah Haldi",
        "Ramdev Turmeric", "Patanjali Haldi", "24 Mantra Organic Haldi",
        "Organic Tattva Haldi", "BB Royal Turmeric", "Vedaka Haldi",
        "Eastern Turmeric", "MTR Haldi", "Goldiee Turmeric",
        "Pushp Turmeric", "Vasant Masala Haldi", "JK Turmeric",
        "Suhana Haldi", "Kitchen King Haldi",
        "Everest Lakadong", "MDH Kashmiri Haldi",
        "Catch Lakadong", "Tata Sampann Lakadong",
        "Aashirvaad Lakadong", "Badshah Lakadong",
        "Ramdev Lakadong", "Patanjali Lakadong",
        "24 Mantra Lakadong", "Organic Tattva Lakadong",
        "BB Royal Lakadong", "Vedaka Lakadong",
        "Eastern Lakadong", "MTR Lakadong",
        "Goldiee Lakadong", "Pushp Lakadong",
        "Suhana Lakadong"
		};
		System.out.println("\n"+"Turmeric Brands are :"+"\n");
			return turmericBrands;
		}
		
		if (productName=="ChilliPowder") {
			String[] chilliBrands = {
        "Everest Chilli Powder", "MDH Red Chilli", "Catch Chilli Powder",
        "Tata Sampann Chilli", "Aashirvaad Chilli Powder", "Badshah Chilli",
        "Ramdev Red Chilli", "Patanjali Chilli Powder", "24 Mantra Chilli",
        "Organic Tattva Chilli", "BB Royal Chilli", "Vedaka Chilli Powder",
        "Eastern Chilli", "MTR Chilli Powder", "Goldiee Chilli",
        "Pushp Chilli Powder", "Vasant Chilli", "JK Chilli Powder",
        "Suhana Chilli Powder", "Kitchen King Chilli",
        "Everest Kashmiri Chilli", "MDH Kashmiri Chilli",
        "Catch Kashmiri Chilli", "Tata Sampann Kashmiri",
        "Aashirvaad Kashmiri", "Badshah Kashmiri",
        "Ramdev Kashmiri", "Patanjali Kashmiri",
        "24 Mantra Kashmiri", "Organic Tattva Kashmiri",
        "BB Royal Kashmiri", "Vedaka Kashmiri",
        "Eastern Kashmiri", "MTR Kashmiri",
        "Goldiee Kashmiri", "Pushp Kashmiri",
        "Suhana Kashmiri"
		};
		System.out.println("\n"+"ChilliPowder Brands are :"+"\n");
			return chilliBrands;
		}
		
		if (productName=="Ghee") {
			String[] gheeBrands = {
        "Amul Ghee", "Nandini Ghee", "Aashirvaad Ghee",
        "Patanjali Cow Ghee", "Mother Dairy Ghee", "Milma Ghee",
        "Heritage Ghee", "Ananda Ghee", "Gowardhan Ghee",
        "Sri Sri Cow Ghee", "24 Mantra Organic Ghee", "Organic Tattva Ghee",
        "BB Royal Ghee", "Vedaka Ghee", "Paras Ghee",
        "Madhusudan Ghee", "Srestha Ghee", "Vedic Ghee",
        "Gir Cow Ghee", "Kamdhenu Ghee",
        "Amul Cow Ghee", "Nandini Pure Ghee",
        "Aashirvaad Pure Ghee", "Patanjali Pure Ghee",
        "Mother Dairy Pure Ghee", "Milma Pure Ghee",
        "Heritage Pure Ghee", "Ananda Pure Ghee",
        "Gowardhan Pure Ghee", "Sri Sri Pure Ghee",
        "24 Mantra Pure Ghee", "Organic Tattva Pure Ghee",
        "BB Royal Pure Ghee", "Vedaka Pure Ghee",
        "Paras Pure Ghee", "Madhusudan Pure Ghee",
        "Kamdhenu Pure Ghee"
		};
		System.out.println("\n"+"Ghee Brands are :"+"\n");
			return gheeBrands;
		}
		
		if (productName=="MoongDal") {
			String[] moongDalBrands = {
        "Tata Sampann Moong Dal", "Aashirvaad Moong Dal", "Fortune Moong Dal",
        "24 Mantra Organic Moong", "Organic Tattva Moong", "BB Royal Moong Dal",
        "Vedaka Moong Dal", "Natureland Moong Dal", "Patanjali Moong Dal",
        "Rajdhani Moong Dal", "Laxmi Moong Dal", "Double Horse Moong",
        "Shakti Bhog Moong", "Golden Harvest Moong", "Farm Fresh Moong",
        "Srestha Moong Dal", "MTR Moong Dal", "Eastern Moong Dal",
        "Annapurna Moong Dal", "Udhaiyam Moong Dal",
        "Tata Premium Moong", "Aashirvaad Premium Moong",
        "Fortune Premium Moong", "24 Mantra Premium Moong",
        "Organic Tattva Premium Moong", "BB Royal Premium Moong",
        "Vedaka Premium Moong", "Natureland Premium Moong",
        "Patanjali Premium Moong", "Rajdhani Premium Moong",
        "Laxmi Premium Moong", "Double Horse Premium Moong",
        "Shakti Bhog Premium Moong", "Golden Harvest Premium Moong",
        "Farm Fresh Premium Moong", "Srestha Premium Moong",
        "MTR Premium Moong"
		};
		System.out.println("\n"+"Moong Dal Brands are :"+"\n");
			return moongDalBrands;
		}
		
		if (productName=="Pickle") {
			String[] pickleBrands = {
        "Mother's Recipe Pickle", "Priya Pickle", "Aachi Pickle",
        "Eastern Pickle", "Patanjali Pickle", "MTR Pickle",
        "Bedekar Pickle", "Double Horse Pickle", "Annapurna Pickle",
        "Udhaiyam Pickle", "Vadu Mango Pickle", "Nilons Pickle",
        "Ramdev Pickle", "24 Mantra Pickle", "Organic Tattva Pickle",
        "BB Royal Pickle", "Vedaka Pickle", "Kitchen King Pickle",
        "Suhana Pickle", "Pushp Pickle",
        "Mother's Mango Pickle", "Priya Mango Pickle",
        "Aachi Mango Pickle", "Eastern Mango Pickle",
        "Patanjali Mango Pickle", "MTR Mango Pickle",
        "Bedekar Mango Pickle", "Double Horse Mango Pickle",
        "Annapurna Mango Pickle", "Udhaiyam Mango Pickle",
        "Nilons Mango Pickle", "Ramdev Mango Pickle",
        "24 Mantra Mango Pickle", "Organic Tattva Mango",
        "BB Royal Mango Pickle", "Vedaka Mango Pickle",
        "Suhana Mango Pickle"
		};
		System.out.println("\n"+"Pickle Brands are :"+"\n");
			return pickleBrands;
		}
		
		if (productName=="UradDal") {
			String[] uradDalBrands = {
        "Tata Sampann Urad Dal", "Aashirvaad Urad Dal", "Fortune Urad Dal",
        "24 Mantra Organic Urad", "Organic Tattva Urad", "BB Royal Urad Dal",
        "Vedaka Urad Dal", "Natureland Urad Dal", "Patanjali Urad Dal",
        "Rajdhani Urad Dal", "Laxmi Urad Dal", "Double Horse Urad",
        "Shakti Bhog Urad", "Golden Harvest Urad", "Farm Fresh Urad",
        "Srestha Urad Dal", "MTR Urad Dal", "Eastern Urad Dal",
        "Annapurna Urad Dal", "Udhaiyam Urad Dal",
        "Tata Premium Urad", "Aashirvaad Premium Urad",
        "Fortune Premium Urad", "24 Mantra Premium Urad",
        "Organic Tattva Premium Urad", "BB Royal Premium Urad",
        "Vedaka Premium Urad", "Natureland Premium Urad",
        "Patanjali Premium Urad", "Rajdhani Premium Urad",
        "Laxmi Premium Urad", "Double Horse Premium Urad",
        "Shakti Bhog Premium Urad", "Golden Harvest Premium Urad",
        "Farm Fresh Premium Urad", "Srestha Premium Urad",
        "MTR Premium Urad"
		};
		System.out.println("\n"+"Urad Dal Brands are :"+"\n");
			return uradDalBrands;
		}
		
		if (productName=="ToorDal") {
			String[] toorDalBrands = {
        "Tata Sampann Toor Dal", "Aashirvaad Toor Dal", "Fortune Toor Dal",
        "24 Mantra Organic Toor", "Organic Tattva Toor", "BB Royal Toor Dal",
        "Vedaka Toor Dal", "Natureland Toor Dal", "Patanjali Arhar Dal",
        "Rajdhani Toor Dal", "Laxmi Toor Dal", "Double Horse Toor",
        "Shakti Bhog Toor", "Golden Harvest Toor", "Farm Fresh Toor",
        "Srestha Toor Dal", "MTR Toor Dal", "Eastern Toor Dal",
        "Annapurna Toor Dal", "Udhaiyam Toor Dal",
        "Tata Premium Toor", "Aashirvaad Premium Toor",
        "Fortune Premium Toor", "24 Mantra Premium Toor",
        "Organic Tattva Premium Toor", "BB Royal Premium Toor",
        "Vedaka Premium Toor", "Natureland Premium Toor",
        "Patanjali Premium Toor", "Rajdhani Premium Toor",
        "Laxmi Premium Toor", "Double Horse Premium Toor",
        "Shakti Bhog Premium Toor", "Golden Harvest Premium Toor",
        "Farm Fresh Premium Toor", "Srestha Premium Toor",
        "MTR Premium Toor"
		};
		System.out.println("\n"+"Toor Dal Brands are :"+"\n");
			return toorDalBrands;
		}
		
		if (productName=="MasoorDal") {
			String[] MasoorDalBrands = {
        "Tata Sampann Moong Dal", "Aashirvaad Moong Dal", "Fortune Moong Dal",
        "24 Mantra Organic Moong", "Organic Tattva Moong", "BB Royal Moong Dal",
        "Vedaka Moong Dal", "Natureland Moong Dal", "Patanjali Moong Dal",
        "Rajdhani Moong Dal", "Laxmi Moong Dal", "Double Horse Moong",
        "Shakti Bhog Moong", "Golden Harvest Moong", "Farm Fresh Moong",
        "Srestha Moong Dal", "MTR Moong Dal", "Eastern Moong Dal",
        "Annapurna Moong Dal", "Udhaiyam Moong Dal",
        "Tata Premium Moong", "Aashirvaad Premium Moong",
        "Fortune Premium Moong", "24 Mantra Premium Moong",
        "Organic Tattva Premium Moong", "BB Royal Premium Moong",
        "Vedaka Premium Moong", "Natureland Premium Moong",
        "Patanjali Premium Moong", "Rajdhani Premium Moong",
        "Laxmi Premium Moong", "Double Horse Premium Moong",
        "Shakti Bhog Premium Moong", "Golden Harvest Premium Moong",
        "Farm Fresh Premium Moong", "Srestha Premium Moong",
        "MTR Premium Moong"
		};
		System.out.println("\n"+"MasoorDal Brands are :"+"\n");
			return MasoorDalBrands;
		}
		
		if (productName=="Juice") {
			String[] juiceBrands = {
        "Tropicana", "Real Juice", "Minute Maid", "Frooti", "Maaza", "Del Monte", 
        "Rasna", "Paper Boat", "Raw Pressery", "Mapro", "B Natural", "Appy Fizz", 
        "Slice", "Ceres", "Frooti Delight", "Hortex", "Jungle Juice", "Rubicon", 
        "Dabur Real", "Nectar", "Bailey Juice", "Tropicana Essentials", "Fruzee", 
        "Real Activ", "Minute Maid Pulpy", "Frooti Fun", "Maaza Mango", "Del Monte Mixed Fruit",
        "Rasna Mango", "Paper Boat Aamras", "Raw Pressery Orange", "Mapro Mixed Fruit",
        "B Natural Orange", "Appy Fizz Apple", "Slice Mango", "Ceres Orange", "Frooti Mango"
		};
		System.out.println("\n"+"Juice Brands are :"+"\n");
			return juiceBrands;
		}
		
		if (productName=="IceCream") {
			String[] iceCreamBrands = {
        "Amul", "Kwality Wall's", "Häagen-Dazs", "Baskin Robbins", "Cornetto", 
        "Cream Bell", "Naturals", "Mother Dairy", "Vadilal", "Häagen-Dazs Chocolate", 
        "Baskin Robbins Oreo", "Kwality Wall's Feast", "Amul Masti", "Cornetto Choco Fills",
        "Cream Bell Fruit Blast", "Naturals Tender Coconut", "Mother Dairy Vanilla",
        "Vadilal Butterscotch", "Häagen-Dazs Strawberry", "Baskin Robbins Chocolate Chip",
        "Kwality Wall's Choco Brownie", "Amul Butterscotch", "Cornetto Strawberry",
        "Cream Bell Choco Chip", "Naturals Mango", "Mother Dairy Kesar Pista",
        "Vadilal Strawberry", "Häagen-Dazs Coffee", "Baskin Robbins Praline",
        "Kwality Wall's Fruit & Nut", "Amul Chocolate", "Cornetto Vanilla",
        "Cream Bell Strawberry", "Naturals Sitaphal", "Mother Dairy Choco", 
        "Vadilal Mango", "Häagen-Dazs Vanilla"
		};
		System.out.println("\n"+"IceCream Brands are :"+"\n");
			return iceCreamBrands;
		}
		
		if (productName=="Honey") {
			String[] honeyBrands = {
        "Dabur Honey", "Patanjali Honey", "Zandu Pure Honey", "24 Mantra Organic Honey", 
        "Natureland Organic Honey", "Himalaya Pure Honey", "Apis Honey", "Forever Bee Honey",
        "Urban Platter Honey", "Pride of Ceylon Honey", "BB Royal Honey", "Vedaka Honey",
        "Capilano Honey", "Beekeeper's Honey", "Golden Drops Honey", "Farm Fresh Honey",
        "Madhava Honey", "Pure & Sure Honey", "Ruchi Honey", "Happenings Honey", 
        "Organic India Honey", "Tata Honey", "Amul Honey", "Nature's Nectar Honey",
        "Raw Pressery Honey", "Fresho Honey", "Aura Honey", "Goodricke Honey",
        "Vedic Bee Honey", "Jungle Honey", "Herbal Honey", "Sunlife Honey", 
        "Beezy Honey", "Heavenly Honey", "Earthpure Honey", "Healthy Bee Honey", "Bee Pure Honey"
		};
		System.out.println("\n"+"Honey Brands are :"+"\n");
			return honeyBrands;
		}
		
		if (productName=="CookingMasala") {
			String[] cookingMasalaBrands = {
        "MDH Masala", "Everest Masala", "Catch Masala", "Patanjali Masala", 
        "Aachi Masala", "Badshah Masala", "Gits Masala", "Priya Masala", 
        "Eastern Masala", "Suhana Masala", "Kitchen King", "MTR Masala", 
        "Rajnigandha Masala", "Ashoka Masala", "Vasant Masala", "24 Mantra Organic Masala",
        "Organic Tattva Masala", "BB Royal Masala", "Vedaka Masala", "Shan Masala",
        "Deep Masala", "Ramdev Masala", "Sri Sri Masala", "Golden Harvest Masala",
        "Pushp Masala", "Himalaya Masala", "Natureland Masala", "Laxmi Masala", 
        "Annapurna Masala", "Farm Fresh Masala", "Udhaiyam Masala", "Eastern Premium Masala",
        "Kitchen Delight", "Badshah Premium Masala", "Suhana Premium Masala", "Priya Premium Masala", "MDH Royal Masala"
		};
		System.out.println("\n"+"CookingMasala Brands are :"+"\n");
			return cookingMasalaBrands;
		}
		
		if (productName=="Snacks") {
			String[] snacksBrands = {
        "Lays", "KurKure", "Bingo Mad Angles", "Haldiram's", "Balaji Wafers", "Pepsi Co", 
        "Kurkure Masala Munch", "Uncle Chips", "Bikaji", "Bingo Yippee", 
        "Pringles", "Smith's Chips", "Tango", "Frito Lay", "Too Yumm", 
        "Cheetos", "Maggie Snack", "MTR Snacks", "Haldiram Bhujia", "Lays Maxx", 
        "Kurkure Fryums", "Bingo Orange", "Balaji Chips", "Pepsi Co Salted", "Uncle Chips Masala",
        "Bikaji Mixture", "Bingo Baked", "Pringles Sour Cream", "Smith's Salt & Vinegar", 
        "Tango Tikki", "Frito Lay Combo", "Too Yumm Chips", "Cheetos Crunchy", "Maggie Veggie", 
        "MTR Bhujia", "Haldiram Namkeen", "Lays American Style", "Kurkure Chatka"
		};
		System.out.println("\n"+"Snacks Brands are :"+"\n");
			return snacksBrands;
		}
		
		if (productName=="SoftDrinks") {
			String[] softDrinksBrands = {
        "Coca-Cola", "Pepsi", "Sprite", "Fanta", "Mountain Dew", "Thums Up", 
        "Mirinda", "7Up", "Maaza", "Slice", "Appy Fizz", "Real Activ", 
        "Red Bull", "Monster Energy", "Pepsi Diet", "Coca-Cola Zero", 
        "Fanta Orange", "Fanta Lemon", "Sprite Zero", "Mountain Dew Code Red",
        "Thums Up Strong", "Pepsi Black", "Mirinda Orange", "7Up Free",
        "Maaza Mango", "Slice Mango", "Appy Fizz Apple", "Red Bull Sugar Free", 
        "Monster Zero", "Coca-Cola Vanilla", "Pepsi Wild Cherry", "Sprite Lemon Lime", 
        "Fanta Berry", "Mountain Dew Live Wire", "Thums Up Masala", "Maaza Tropical", "Slice Fruit Punch"
		};
		System.out.println("\n"+"softDrinks Brands are :"+"\n");
			return softDrinksBrands;
		}
		
		if (productName=="CookingOilPremium") {
			String[] cookingOilPremiumBrands = {
        "Saffola Gold", "Fortune Soya", "Fortune Rice Bran", "Dhara Mustard", 
        "Gemini Sunflower", "Freedom Refined", "Nature Fresh Cold Pressed", 
        "24 Mantra Organic Oil", "Patanjali Mustard Oil", "Organic Tattva Sunflower",
        "BB Royal Groundnut", "Vedaka Rice Bran", "Gold Winner Refined", "Sunpure Sunflower",
        "Fortune Cold Pressed", "Saffola Active", "Dalda Refined", "VVD Gold", 
        "Saffola Tasty", "Fortune Groundnut", "Dhara Rice Bran", "Gemini Cold Pressed", 
        "Freedom Sunflower", "Nature Fresh Rice Bran", "24 Mantra Mustard", "Patanjali Sunflower", 
        "Organic Tattva Mustard", "BB Royal Sunflower", "Vedaka Mustard", "Gold Winner Mustard", 
        "Sunpure Groundnut", "Fortune Coconut Oil", "Saffola Omega", "Dalda Mustard", "VVD Sunflower", "Saffola Total", "Fortune MultiGrain"
		};
		System.out.println("\n"+"Cooking Oil Premium Brands are :"+"\n");
			return cookingOilPremiumBrands;
		}
		
		if (productName=="Sauces") {
			String[] saucesBrands = {
        "Kissan Tomato Sauce", "Heinz Tomato Ketchup", "FunFoods Tomato Sauce",
        "Del Monte Sauce", "American Garden", "Dabur Tomato Sauce", "Veeba Sauce",
        "Maggi Sauce", "MTR Tomato Sauce", "Mother's Recipe Sauce", "Tops Sauce",
        "Everest Sauce", "Catch Sauce", "Patanjali Tomato Sauce", "BB Royal Sauce",
        "Vedaka Sauce", "Kwality Sauce", "Kraft Tomato Sauce", "FunFoods Green Chilli",
        "Veeba Schezwan", "Del Monte Garlic Sauce", "Heinz Chilli Sauce", "Kissan Schezwan",
        "Maggi Schezwan Sauce", "Tata Sampann Tomato Sauce", "Pride of India Sauce",
        "Organic Tattva Tomato Sauce", "24 Mantra Organic Sauce", "BB Royal Tomato Ketchup",
        "Vedaka Tomato Sauce", "FunFoods BBQ Sauce", "Heinz BBQ Sauce", "Veeba Mayo Sauce",
        "American Garden BBQ", "Del Monte Spicy", "Kraft Chilli Sauce", "Patanjali Schezwan"
		};
		System.out.println("\n"+"Sauces Brands are :"+"\n");
			return saucesBrands;
		}
		
		if (productName=="Ketchup") {
			String[] ketchupBrands = {
        "Heinz Tomato Ketchup", "Kissan Ketchup", "FunFoods Tomato Ketchup",
        "Del Monte Ketchup", "Veeba Tomato Ketchup", "Maggi Ketchup", "Mother's Recipe Ketchup",
        "Tops Ketchup", "Everest Ketchup", "Catch Tomato Ketchup", "Patanjali Ketchup",
        "BB Royal Ketchup", "Vedaka Ketchup", "Kraft Ketchup", "FunFoods Red Chilli",
        "Veeba Schezwan Ketchup", "Del Monte Spicy Ketchup", "Heinz Chili Ketchup",
        "Kissan Schezwan Ketchup", "Maggi Tomato Ketchup", "Tata Sampann Ketchup",
        "Pride of India Ketchup", "Organic Tattva Ketchup", "24 Mantra Organic Ketchup",
        "BB Royal Spicy Ketchup", "Vedaka Tomato Ketchup", "FunFoods Sweet Ketchup",
        "Heinz Sweet Chilli", "Veeba Sweet & Sour", "American Garden Ketchup",
        "Del Monte Sweet", "Kraft Sweet Ketchup", "Patanjali Sweet Ketchup",
        "Heinz Organic Ketchup", "FunFoods Garlic Ketchup", "Veeba Tangy Ketchup",
        "Tata Sampann Sweet Ketchup"
		};
		System.out.println("\n"+"Ketchup Brands are :"+"\n");
			return ketchupBrands;
		}
		
		if (productName=="Namkeen") {
			String[] namkeenBrands = {
        "Haldiram's Bhujia", "Bikaji Namkeen", "Balaji Namkeen", "MTR Namkeen",
        "Nirma Namkeen", "Lays Namkeen", "Suhana Namkeen", "Bingo Namkeen",
        "Rajdhani Namkeen", "Aachi Namkeen", "Eastern Namkeen", "Shakti Bhog Namkeen",
        "BB Royal Namkeen", "Vedaka Namkeen", "24 Mantra Organic Namkeen",
        "Patanjali Namkeen", "Mother Dairy Namkeen", "Amul Namkeen", "Fortune Namkeen",
        "Uncle Chips Namkeen", "Pepsi Co Namkeen", "Too Yumm Namkeen", "Snackaroo",
        "MTR Bhujia", "Haldiram Mix", "Bikaji Mixture", "Balaji Mixture",
        "Lays Stax", "Suhana Mix", "Bingo Chips", "Eastern Bhujia",
        "Shakti Bhog Mix", "BB Royal Mixture", "Vedaka Mix", "Patanjali Mixture",
        "Mother Dairy Mix", "Amul Mixture", "Fortune Mixture"
		};
		System.out.println("\n"+"Namkeen Brands are :"+"\n");
			return namkeenBrands;
		}
		
		if (productName=="CleaningPowder") {
			String[] cleaningPowderBrands = {
        "Harpic", "Lizol", "Domex", "Vim Powder", "Scotch Brite", "Dettol Powder", 
        "Mr. Muscle", "Colin", "Patanjali Herbal Cleaner", "Godrej Lemon Clean", 
        "Surf Excel Easy Wash", "Tide Powder", "Ariel Powder", "Rin Powder", 
        "Vim Dishwash", "Odonil Cleaner", "Vanish Powder", "Himalaya Cleaning Powder", 
        "BB Royal Cleaning Powder", "Vedaka Cleaning Powder", "24 Mantra Organic Powder", 
        "Tata Sampann Powder", "Dabur Herbal Powder", "Shakti Bhog Powder", "MTR Cleaning Powder", 
        "Haldiram Cleaning Powder", "Amul Cleaning Powder", "Mother Dairy Powder", 
        "Fortune Cleaning Powder", "Unilever Cleaning Powder", "P&G Cleaning Powder", 
        "Reckitt Cleaning Powder", "Everest Cleaner", "Catch Cleaning Powder", "Pepsodent Cleaner",
        "Colgate Herbal Powder"
		};
		System.out.println("\n"+"Cleaning Powder Brands are :"+"\n");
			return cleaningPowderBrands;
		}
		
		if (productName=="PersonalCare") {
			String[] personalCareBrands = {
        "Dove", "Pond's", "Nivea", "Himalaya", "Patanjali", "Vicco", "Lotus Herbals", 
        "Lakme", "Mamaearth", "The Body Shop", "Garnier", "Neutrogena", "Loreal", 
        "Biotique", "Dabur Herbal", "Tresemme", "Clinic Plus", "Sunsilk", 
        "Johnson's Baby", "Khadi Natural", "Ayush", "Vaseline", "Himalaya Herbals", 
        "Natureland", "BB Royal Personal Care", "Vedaka Personal Care", "24 Mantra Organic",
        "Tata Sampann Personal Care", "Amul Care", "Mother Dairy Care", "Fortune Care",
        "Unilever Personal Care", "P&G Personal Care", "Reckitt Personal Care", "Nivea Men", 
        "Dove Men", "Pond's Men"
		};
		System.out.println("\n"+"Personal Care Brands are :"+"\n");
			return personalCareBrands;
		}
		
		if (productName=="HerbalTeas") {
			String[] herbalTeaBrands = {
        "Tetley Green Tea", "Twinings Herbal", "Organic India Tulsi", "Typhoo Herbal", 
        "Tea Trunk", "Himalaya Herbal Tea", "Vahdam Green Tea", "Wagh Bakri Green", 
        "Tata Tea Chakra Gold Green", "Brooke Bond Taj Mahal Green", "24 Mantra Organic Green", 
        "Patanjali Herbal Green", "BB Royal Green Tea", "Vedaka Green Tea", "Natureland Organic Tea", 
        "MTR Green Tea", "Eastern Herbal Tea", "Society Tea Green", "Girnar Green Tea", 
        "Teabox Green", "Blue Tokai Green", "Sleepy Owl Green Tea", "Raw Pressery Green", 
        "Tata Tea Green Tea", "Red Label Green Tea", "Green Plantation Tea", "Organic India Green", 
        "Vahdam Herbal", "Tetley Tulsi", "Twinings Green", "Himalaya Tulsi", 
        "Typhoo Green", "Tea Trunk Tulsi", "Wagh Bakri Tulsi", "Brooke Bond Green", 
        "Tata Sampann Herbal", "24 Mantra Herbal", "BB Royal Herbal"
		};
		System.out.println("\n"+"Herbal teas Brands are :"+"\n");
			return herbalTeaBrands;
		}
		
		if (productName=="MobilePhones") {
			String[] mobileBrands = {
        "Samsung Galaxy S23", "iPhone 15",
        "OnePlus 12", "Vivo V29",
        "Oppo Reno 10", "Realme Narzo",
        "Redmi Note 13", "Poco X5",
        "Motorola Edge", "Nokia G42",
        "Samsung Galaxy A54", "iPhone 14",
        "OnePlus Nord", "Vivo Y100",
        "Oppo F23", "Realme 11 Pro",
        "Redmi 12", "Poco F5",
        "Motorola G73", "Nokia C32",
        "Samsung Galaxy M34", "iPhone 13",
        "OnePlus 11R", "Vivo T2",
        "Oppo A78", "Realme C55",
        "Redmi A2", "Poco M6",
        "Motorola E13", "Nokia X30",
        "Samsung Galaxy Z Flip", "iPhone SE",
        "OnePlus Open", "Vivo X90",
        "Oppo Find X", "Realme GT",
        "Redmi K50"
		};
		System.out.println("\n"+"Mobile Phones Brands are :"+"\n");
			return mobileBrands;
		}
		
		if (productName=="Tablets") {
			String[] tabletBrands = {
        "Samsung Galaxy S23", "iPhone 15",
        "OnePlus 12", "Vivo V29",
        "Oppo Reno 10", "Realme Narzo",
        "Redmi Note 13", "Poco X5",
        "Motorola Edge", "Nokia G42",
        "Samsung Galaxy A54", "iPhone 14",
        "OnePlus Nord", "Vivo Y100",
        "Oppo F23", "Realme 11 Pro",
        "Redmi 12", "Poco F5",
        "Motorola G73", "Nokia C32",
        "Samsung Galaxy M34", "iPhone 13",
        "OnePlus 11R", "Vivo T2",
        "Oppo A78", "Realme C55",
        "Redmi A2", "Poco M6",
        "Motorola E13", "Nokia X30",
        "Samsung Galaxy Z Flip", "iPhone SE",
        "OnePlus Open", "Vivo X90",
        "Oppo Find X", "Realme GT",
        "Redmi K50"
		};
		System.out.println("\n"+"Tablets Brands are :"+"\n");
			return tabletBrands;
		}
		
		if (productName=="Watches") {
			String[] watchBrands = {
        "Titan Karishma", "Fastrack Trendy",
        "Casio G-Shock", "Sonata Gold",
        "Timex Analog", "Fossil Gen 6",
        "Rolex Submariner", "Omega Seamaster",
        "Titan Edge", "Fastrack Reflex",
        "Casio Edifice", "Sonata Smart",
        "Timex Expedition", "Fossil Hybrid",
        "Rolex Daytona", "Omega Constellation",
        "Titan Raga", "Fastrack Limitless",
        "Casio Vintage", "Sonata Digital",
        "Timex Automatic", "Fossil Grant",
        "Rolex Oyster", "Omega Speedmaster",
        "Titan Octane", "Fastrack Tees",
        "Casio Youth", "Sonata Classic",
        "Timex Fashion", "Fossil Machine",
        "Rolex Datejust", "Omega Aqua Terra",
        "Titan Neo", "Fastrack Analog",
        "Casio Pro Trek", "Sonata Wedding",
        "Timex Weekender"
		};
		System.out.println("\n"+"Watches Brands are :"+"\n");
			return watchBrands;
		}
		
		if (productName=="SoftDrinks") {
			String[] drinkBrands = {
        "Coca Cola", "Pepsi",
        "Sprite", "Fanta",
        "Thums Up", "Limca",
        "7Up", "Mirinda",
        "Mountain Dew", "Slice",
        "Maaza", "Appy Fizz",
        "Red Bull", "Monster",
        "Sting", "Gatorade",
        "Coca Cola Zero", "Pepsi Black",
        "Sprite Zero", "Fanta Orange",
        "Thums Up Strong", "Limca Lemon",
        "7Up Nimbooz", "Mirinda Orange",
        "Mountain Dew Ice", "Slice Mango",
        "Maaza Gold", "Appy Classic",
        "Red Bull Sugar Free", "Monster Energy",
        "Sting Blue", "Gatorade Orange",
        "Coca Cola Diet", "Pepsi Twist",
        "Sprite Lemon"
		};
		System.out.println("\n"+"Soft Drinks Brands are :"+"\n");
			return drinkBrands;
		}
		
		if (productName=="Moisturizer") {
			String[] MoisturizerBrands = {
        "Ponds Light Moisturizer", "Nivea Soft",
        "Fair & Lovely Advanced", "Lakme Peach Milk",
        "Himalaya Nourishing", "Garnier Bright Complete",
        "Olay Total Effects", "Mamaearth Vitamin C",
        "WOW Skin Science", "Biotique Morning Nectar",
        "Ponds Super Light", "Nivea Creme",
        "Lakme Perfect Radiance", "Himalaya Aloe Vera",
        "Garnier Vitamin C", "Olay Natural White",
        "Mamaearth Ubtan", "WOW Aloe Vera",
        "Biotique Saffron", "Patanjali Saundarya",
        "Ponds Cold Cream", "Nivea Men",
        "Lakme 9to5", "Himalaya Winter Care",
        "Garnier Sakura", "Olay Day Cream",
        "Mamaearth Retinol", "WOW Vitamin E",
        "Biotique Coconut", "Patanjali Aloe",
        "Ponds Bright Beauty", "Nivea Extra White",
        "Lakme Absolute", "Himalaya Radiance",
        "Garnier Moisture Bomb", "Olay Night Cream",
        "Mamaearth Tea Tree"
		};
		System.out.println("\n"+"Moisturizer Brands are :"+"\n");
			return MoisturizerBrands;
		}
		
		if (productName=="Cleaner") {
			String[] cleanerBrands = {
        "Ponds Light Moisturizer", "Nivea Soft",
        "Fair & Lovely Advanced", "Lakme Peach Milk",
        "Himalaya Nourishing", "Garnier Bright Complete",
        "Olay Total Effects", "Mamaearth Vitamin C",
        "WOW Skin Science", "Biotique Morning Nectar",
        "Ponds Super Light", "Nivea Creme",
        "Lakme Perfect Radiance", "Himalaya Aloe Vera",
        "Garnier Vitamin C", "Olay Natural White",
        "Mamaearth Ubtan", "WOW Aloe Vera",
        "Biotique Saffron", "Patanjali Saundarya",
        "Ponds Cold Cream", "Nivea Men",
        "Lakme 9to5", "Himalaya Winter Care",
        "Garnier Sakura", "Olay Day Cream",
        "Mamaearth Retinol", "WOW Vitamin E",
        "Biotique Coconut", "Patanjali Aloe",
        "Ponds Bright Beauty", "Nivea Extra White",
        "Lakme Absolute", "Himalaya Radiance",
        "Garnier Moisture Bomb", "Olay Night Cream",
        "Mamaearth Tea Tree"
		};
		System.out.println("\n"+"Cleaner Brands are :"+"\n");
			return cleanerBrands;
		}
		
		if (productName=="Detergent") {
			String[] detergentBrands = {
        "Surf Excel", "Tide", "Ariel", "Wheel", "Nirma", "Henko", "Vim Bar", 
        "Sunlight", "Rin", "Ghadi", "Santoor Detergent", "Patanjali Herbal Detergent", 
        "OMO", "Tide Plus", "Surf Excel Matic", "Ariel Matic", "Rin Bar", 
        "Vanish", "Comfort Detergent", "Himalaya Detergent", "BB Royal Detergent", 
        "Vedaka Detergent", "Godrej Ezee", "24 Mantra Organic Detergent", 
        "Natureland Detergent", "Tata Sampann Detergent", "Dabur Herbal Detergent", 
        "Shakti Bhog Detergent", "MTR Detergent", "Haldiram Detergent", "Amul Detergent", 
        "Mother Dairy Detergent", "Fortune Detergent", "Unilever Detergent", "P&G Detergent", 
        "Reckitt Detergent"
		};
		System.out.println("\n"+"Detergent Brands are :"+"\n");
			return detergentBrands;
		}
		
		
		if (productName=="RoseWater") {
			String[] roseWaterBrands = {
        "Ponds Light Moisturizer", "Nivea Soft",
        "Fair & Lovely Advanced", "Lakme Peach Milk",
        "Himalaya Nourishing", "Garnier Bright Complete",
        "Olay Total Effects", "Mamaearth Vitamin C",
        "WOW Skin Science", "Biotique Morning Nectar",
        "Ponds Super Light", "Nivea Creme",
        "Lakme Perfect Radiance", "Himalaya Aloe Vera",
        "Garnier Vitamin C", "Olay Natural White",
        "Mamaearth Ubtan", "WOW Aloe Vera",
        "Biotique Saffron", "Patanjali Saundarya",
        "Ponds Cold Cream", "Nivea Men",
        "Lakme 9to5", "Himalaya Winter Care",
        "Garnier Sakura", "Olay Day Cream",
        "Mamaearth Retinol", "WOW Vitamin E",
        "Biotique Coconut", "Patanjali Aloe",
        "Ponds Bright Beauty", "Nivea Extra White",
        "Lakme Absolute", "Himalaya Radiance",
        "Garnier Moisture Bomb", "Olay Night Cream",
        "Mamaearth Tea Tree"
		};
		System.out.println("Rose Water Brands are :"+"\n");
			return roseWaterBrands;
		}
		
		if (productName=="FlourAlternative") {
			String[] flourAlternativeBrands = {
        "Bob's Red Mill Almond Flour", "NutriGold Oats Flour", "24 Mantra Organic Ragi",
        "Patanjali Ragi Flour", "Natureland Organic Buckwheat", "BB Royal Jowar Flour", 
        "Vedaka Bajra Flour", "Organic India Quinoa Flour", "Fortune MultiGrain Flour", 
        "Aashirvaad MultiGrain Flour", "Shakti Bhog Wheat + Millets", "Annapurna Ragi",
        "Laxmi Jowar", "Farm Fresh Bajra", "24 Mantra Organic Bajra", "BB Royal Ragi",
        "Vedaka Ragi", "Patanjali MultiGrain", "Natureland Quinoa", "Fortune Millet Flour",
        "Aashirvaad Millet Mix", "Amul Soy Flour", "Dabur Herbal Flour", "Milma Oats Flour",
        "Himalaya Ragi", "Mother Dairy Wheat Mix", "Golden Harvest Ragi", "Pushp MultiGrain",
        "Tata Sampann Millet", "Srestha Millet", "Farm Fresh Jowar", "Organic Tattva Millet",
        "BB Royal Bajra Mix", "Vedaka Multigrain", "Natureland Oats Flour", "24 Mantra Organic Wheat",
        "Annapurna Multigrain"
		};
		System.out.println("\n"+"FlourAlternative Brands are :"+"\n");
			return flourAlternativeBrands;
		}
		
		
		if (productName=="SunCream") {
			String[] sunCreamBrands = {
        "Ponds Light Moisturizer", "Nivea Soft",
        "Fair & Lovely Advanced", "Lakme Peach Milk",
        "Himalaya Nourishing", "Garnier Bright Complete",
        "Olay Total Effects", "Mamaearth Vitamin C",
        "WOW Skin Science", "Biotique Morning Nectar",
        "Ponds Super Light", "Nivea Creme",
        "Lakme Perfect Radiance", "Himalaya Aloe Vera",
        "Garnier Vitamin C", "Olay Natural White",
        "Mamaearth Ubtan", "WOW Aloe Vera",
        "Biotique Saffron", "Patanjali Saundarya",
        "Ponds Cold Cream", "Nivea Men",
        "Lakme 9to5", "Himalaya Winter Care",
        "Garnier Sakura", "Olay Day Cream",
        "Mamaearth Retinol", "WOW Vitamin E",
        "Biotique Coconut", "Patanjali Aloe",
        "Ponds Bright Beauty", "Nivea Extra White",
        "Lakme Absolute", "Himalaya Radiance",
        "Garnier Moisture Bomb", "Olay Night Cream",
        "Mamaearth Tea Tree"
		};
		System.out.println("SunCream Brands are :"+"\n");
			return sunCreamBrands;
		}
		
		if (productName=="Deodorants") {
			String[] deoBrands = {
        "Axe Dark Temptation", "Fogg Royal",
        "Engage XX", "Wild Stone Code",
        "Nivea Fresh Active", "Park Avenue Good Morning",
        "Denver Hamilton", "Yardley London",
        "Layer'r Shot", "Set Wet Cool",
        "Axe Signature", "Fogg Dynamic",
        "Engage M1", "Wild Stone Ultra",
        "Nivea Men Deep", "Park Avenue Voyage",
        "Denver Black", "Yardley Gentleman",
        "Layer'r Wottagirl", "Set Wet Charm",
        "Axe Gold", "Fogg Fresh",
        "Engage L'amante", "Wild Stone Edge",
        "Nivea Pearl", "Park Avenue Regal",
        "Denver Pride", "Yardley Royale",
        "Layer'r Shot Maxx", "Set Wet Global",
        "Axe Ice Chill", "Fogg Napoleon",
        "Engage Yin", "Wild Stone Hydra",
        "Nivea Cool Kick", "Park Avenue Storm",
        "Denver Imperial"
		};
		System.out.println("\n"+"Deodorants Brands are :"+"\n");
			return deoBrands;
		}
		
		if (productName=="Handwash") {
			String[] handwashBrands = {
        "Dettol Liquid", "Lifebuoy Total",
        "Savlon Moisture", "Godrej Protekt",
        "Palmolive Naturals", "Himalaya Pure Hands",
        "Patanjali Herbal", "Medimix Ayurvedic",
        "Dabur Sanitize", "Biotique Bio Handwash",
        "Dettol Skincare", "Lifebuoy Lemon",
        "Savlon Herbal", "Godrej Lime",
        "Palmolive Aloe", "Himalaya Neem",
        "Patanjali Aloe", "Medimix 18 Herbs",
        "Dabur Tulsi", "Biotique Basil",
        "Dettol Original", "Lifebuoy Care",
        "Savlon Glycerin", "Godrej Magic",
        "Palmolive Rose", "Himalaya Moisturizing",
        "Patanjali Neem", "Medimix Sandal",
        "Dabur Lemon", "Biotique Honey",
        "Dettol Fresh", "Lifebuoy Mild",
        "Savlon Active", "Godrej Herbal",
        "Palmolive Lavender", "Himalaya Lemon",
        "Patanjali Orange"
		};
		System.out.println("\n"+"Handwash Brands are :"+"\n");
			return handwashBrands;
		}
		
		if (productName=="Headphones") {
			String[] headphoneBrands = {
        "Boat Rockerz 450", "JBL Tune 760NC",
        "Sony WH-1000XM4", "Realme Buds Wireless",
        "OnePlus Bullets Z2", "Noise Two",
        "Boult Audio Z40", "Skullcandy Crusher",
        "Sennheiser HD 450BT", "Zebronics Zeb Thunder",
        "Boat Airdopes 141", "JBL Live 660NC",
        "Sony WH-CH520", "Realme Buds 2",
        "OnePlus Nord Buds", "Noise Air Buds",
        "Boult Audio Airbass", "Skullcandy Hesh",
        "Sennheiser CX 400BT", "Zebronics Zeb Duke",
        "Boat Rockerz 255", "JBL C100SI",
        "Sony XB910N", "Realme Buds Air",
        "OnePlus Buds Pro", "Noise ColorFit Buds",
        "Boult Audio ProBass", "Skullcandy Ink'd",
        "Sennheiser Momentum", "Zebronics Zeb Bliss",
        "Boat Nirvana", "JBL Quantum 100",
        "Sony MDR ZX110", "Realme TechLife",
        "OnePlus Buds Z"
		};
		System.out.println("Headphones Brands are :"+"\n");
			return headphoneBrands;
		}
		
		if (productName=="Backpacks") {
			String[] bagBrands = {
        "Skybags Casual", "Wildcraft Trekking",
        "American Tourister School", "Safari Laptop",
        "VIP Travel", "Gear Classic",
        "F Gear Military", "Tommy Hilfiger Backpack",
        "Puma Sports", "Adidas Training",
        "Nike Brasilia", "Reebok Active",
        "Skybags College", "Wildcraft Adventure",
        "American Tourister Travel", "Safari Expandable",
        "VIP Office", "Gear Urban",
        "F Gear Luxur", "Tommy Hilfiger Casual",
        "Puma Phase", "Adidas Originals",
        "Nike Heritage", "Reebok Backpack",
        "Skybags Trendy", "Wildcraft Hypadry",
        "American Tourister Lite", "Safari Pro",
        "VIP Elite", "Gear Campus",
        "F Gear Burner", "Tommy Hilfiger Premium",
        "Puma Deck", "Adidas Power",
        "Nike Elite"
		};
		System.out.println("\n"+"Backpacks Brands are :"+"\n");
			return bagBrands;
		}

		if (productName=="PressureCooker") {
			String[] cookerBrands = {
        "Prestige Popular", "Hawkins Classic",
        "Pigeon Special", "Butterfly Blue Line",
        "Vinod Deluxe", "Bergner Argent",
        "Wonderchef Nigella", "Hawkins Contura",
        "Prestige Deluxe", "Pigeon Favourite",
        "Butterfly Curve", "Vinod Hard Anodised",
        "Bergner Triply", "Wonderchef Granite",
        "Hawkins Futura", "Prestige Nakshatra",
        "Pigeon Induction Base", "Butterfly Stainless Steel",
        "Vinod Platinum", "Bergner Pressure Pro",
        "Wonderchef Outer Lid", "Hawkins Hevibase",
        "Prestige Svachh", "Pigeon Aluminium",
        "Butterfly Induction", "Vinod Pearl",
        "Bergner Elite", "Wonderchef Nutri Pot",
        "Hawkins Ceramic", "Prestige Clip On",
        "Pigeon Mini", "Butterfly Compact",
        "Vinod Classic", "Bergner Black",
        "Wonderchef Royal"
		};
		System.out.println("\n"+"PressureCooker Barnds are :"+"\n");
			return cookerBrands;
		}
		
		if (productName=="WaterBottles") {
			String[] bottleBrands = {
        "Milton Thermosteel", "Cello H2O",
        "Tupperware Eco Bottle", "Signoraware Steel",
        "Borosil Hydra", "Prestige Steel Bottle",
        "Pigeon Thermo Bottle", "Amazon Basics Bottle",
        "Nike Sports Bottle", "Adidas Steel Bottle",
        "Milton Flip Lid", "Cello Steel",
        "Tupperware Slim", "Signoraware Flip",
        "Borosil Trek", "Prestige Insulated",
        "Pigeon Steel", "Amazon Basics Steel",
        "Nike Gym Bottle", "Adidas Sipper",
        "Milton Cool Touch", "Cello Thermos",
        "Tupperware Classic", "Signoraware Classic",
        "Borosil Go Sport", "Prestige Thermo",
        "Pigeon Copper", "Amazon Basics Copper",
        "Nike Hypercharge", "Adidas Training",
        "Milton Copper", "Cello Plastic",
        "Tupperware Fliptop", "Signoraware Steel Pro",
        "Borosil Stainless"
		};
		System.out.println("\n"+"WaterBottles Brands are :"+"\n");
			return bottleBrands;
		}
		
		if (productName=="ToothBrush") {
			String[] brushBrands = {
        "Colgate ZigZag", "Oral-B Pro Health",
        "Pepsodent Expert", "Sensodyne Sensitive",
        "Closeup Deep Action", "Colgate Slim Soft",
        "Oral-B CrossAction", "Pepsodent Complete",
        "Sensodyne Repair", "Closeup Diamond",
        "Colgate Active Salt", "Oral-B Indicator",
        "Pepsodent Germicheck", "Sensodyne Fresh",
        "Closeup Green", "Colgate Max Fresh",
        "Oral-B 3D White", "Pepsodent Sensitive",
        "Sensodyne Deep Clean", "Closeup Red",
        "Colgate Super Flexi", "Oral-B All Rounder",
        "Pepsodent Charcoal", "Sensodyne Extra Soft",
        "Closeup Soft", "Colgate Gentle Clean",
        "Oral-B Ultra Thin", "Pepsodent Whitening",
        "Sensodyne Advanced", "Closeup Ever Fresh",
        "Colgate Visible White", "Oral-B Kids",
        "Pepsodent Kids", "Sensodyne Rapid Relief",
        "Closeup Gel"
		};
		System.out.println("\n"+"ToothBrush Brands are :"+"\n");
			return brushBrands;
		}
		
		if (productName=="CeilingFan") {
			String[] fanBrands = {
        "Usha Striker", "Crompton High Speed",
        "Havells Stealth", "Orient Electric Apex",
        "Bajaj Maxima", "Atomberg Renesa",
        "Khaitan Swift", "Luminous Dhoom",
        "Polycab Wizzy", "V-Guard Gatimaan",
        "Usha Bloom", "Crompton Aura",
        "Havells Festiva", "Orient Wendy",
        "Bajaj Frore", "Atomberg Studio",
        "Khaitan Sleek", "Luminous Jaipur",
        "Polycab Elanza", "V-Guard Esfera",
        "Usha Racer", "Crompton Silent Pro",
        "Havells Ambrose", "Orient Aeroquiet",
        "Bajaj Regal", "Atomberg Efficio",
        "Khaitan Deco", "Luminous Morpheus",
        "Polycab Zoomer", "V-Guard Windle",
        "Usha Diplomat", "Crompton Hillbriz",
        "Havells Pacer", "Orient Magic",
        "Bajaj Bahar"
		};
		System.out.println("CeilingFan Brands are :"+"\n");
			return fanBrands;
		}
		
		if (productName=="GasStove") {
			String[] stoveBrands = {
        "Prestige Glass Top", "Sunflame Classic",
        "Pigeon Blaze", "Butterfly Smart",
        "Elica Vetro", "Glen 4 Burner",
        "Faber Cooktop", "Lifelong Gas Stove",
        "Milton Premium", "Brightflame Steel",
        "Prestige Marvel", "Sunflame Pride",
        "Pigeon Favourite", "Butterfly Curve",
        "Elica Auto Ignition", "Glen Toughened",
        "Faber Hob", "Lifelong 3 Burner",
        "Milton Royal", "Brightflame Glass",
        "Prestige Edge", "Sunflame GT",
        "Pigeon Aster", "Butterfly Rapid",
        "Elica Flexi", "Glen Stainless",
        "Faber 3 Burner", "Lifelong Toughened",
        "Milton Elite", "Brightflame Auto",
        "Prestige Svachh", "Sunflame Diamond",
        "Pigeon Star", "Butterfly Signature",
        "Elica 3 Burner"
		};
		System.out.println("\n"+"GasStove Brands are :"+"\n");
			return stoveBrands;
		}
		
		if (productName=="MixerGrinder") {
			String[] mixerBrands = {
        "Preethi Zodiac", "Philips Daily Collection",
        "Bajaj Rex", "Prestige Iris",
        "Butterfly Jet", "Sujata Dynamix",
        "Havells Capture", "Usha Thunderbolt",
        "Lifelong Power Pro", "Wonderchef Nutri Blend",
        "Preethi Blue Leaf", "Philips Viva",
        "Bajaj Majesty", "Prestige Stylo",
        "Butterfly Matchless", "Sujata Supermix",
        "Havells Maxx", "Usha Colt",
        "Lifelong Turbo", "Wonderchef Regalia",
        "Preethi Crown", "Philips HL7756",
        "Bajaj GX-1", "Prestige Supreme",
        "Butterfly Rapid", "Sujata Powermatic",
        "Havells Sprint", "Usha Imprezza",
        "Lifelong Bold", "Wonderchef Desire",
        "Preethi Eco Plus", "Philips Mixer Pro",
        "Bajaj Storm"
		};
		System.out.println("\n"+"MixerGrinder Brands are :"+"\n");
			return mixerBrands;
		}
		
		if (productName=="Mattress") {
			String[] mattressBrands = {
        "Sleepwell Comfort", "Wakefit Orthopedic",
        "Kurlon Dream Sleep", "Duroflex LiveIn",
        "Springfit Ortho", "Peps Restonic",
        "Coirfit Posturematic", "Centuary Sleepables",
        "Sunday Mattress", "Emma Original",
        "Sleepwell Ortho Pro", "Wakefit Dual Comfort",
        "Kurlon Spinel", "Duroflex Back Magic",
        "Springfit Spine Support", "Peps Springkoil",
        "Coirfit Natural", "Centuary Latex",
        "Sunday Ortho", "Emma Hybrid",
        "Sleepwell Spinetech", "Wakefit ShapeSense",
        "Kurlon Dual Roll", "Duroflex Energise",
        "Springfit Dreamer", "Peps Memory Foam",
        "Coirfit Ortho", "Centuary Ortho",
        "Sunday Latex", "Emma Premium",
        "Sleepwell Nexa", "Wakefit Plus",
        "Kurlon Relish"
		};
		System.out.println("\n"+"Mattress Barnds are :"+"\n");
			return mattressBrands;
		}
		
		if (productName=="CarShampoo") {
			String[] carCareBrands = {
        "3M Car Wash", "Formula 1 Wash",
        "Wavex Shampoo", "Turtle Wax Zip",
        "Meguiar's Gold Class", "Bosch Car Shampoo",
        "Sheeba Car Wash", "Waxpol Shampoo",
        "Vista Auto Care", "GoMechanic Foam",
        "3M Foaming Wash", "Formula 1 Foam",
        "Wavex Snow Foam", "Turtle Wax Max",
        "Meguiar's Ultimate", "Bosch Foam Wash",
        "Sheeba Foam Wash", "Waxpol Car Care",
        "Vista Shine", "GoMechanic Shine",
        "3M Auto Special", "Formula 1 Pro",
        "Wavex Gloss", "Turtle Wax Hybrid",
        "Meguiar's Deep Crystal", "Bosch Premium",
        "Sheeba Premium", "Waxpol Glossy",
        "Vista Foam", "GoMechanic Pro",
        "3M Car Care", "Formula 1 Advanced",
        "Wavex Pro"
		};
		System.out.println("\n"+"CarShampoo Brands are :"+"\n");
			return carCareBrands;
		}
		
		if (productName=="PowerBank") {
			String[] powerBankBrands = {
        "Mi 10000mAh", "Realme 20000mAh",
        "Ambrane Stylo", "Syska Power Pro",
        "Boat EnergyShroom", "Redmi Fast Charge",
        "Samsung 10000mAh", "Anker PowerCore",
        "URBN 20000mAh", "Portronics Indo",
        "Mi 20000mAh", "Realme 10000mAh",
        "Ambrane Neos", "Syska 20000mAh",
        "Boat 10000mAh", "Redmi 10000mAh",
        "Samsung 20000mAh", "Anker Slim",
        "URBN Slim", "Portronics Luxcell",
        "Mi 3i", "Realme Dart",
        "Ambrane 20000mAh", "Syska Fast Charge",
        "Boat 20000mAh", "Redmi 3i",
        "Samsung Wireless", "Anker 20000mAh",
        "URBN Type C", "Portronics Power Brick",
        "Mi Pocket", "Realme Mini",
        "Ambrane Capsule", "Syska Pocket",
        "Boat Rugged"
		};
		System.out.println("\n"+"PowerBank Brands are :"+"\n");
			return powerBankBrands;
		}
		
		if (productName=="BluetoothSpeaker") {
			String[] speakerBrands = {
        "JBL Flip 5", "Boat Stone 650",
        "Sony SRS XB13", "Realme Brick",
        "Mi Portable Speaker", "Portronics SoundDrum",
        "Infinity Fuze", "Zebronics Zeb Sound",
        "Marshall Emberton", "Harman Kardon Onyx",
        "JBL Go 3", "Boat Stone 350",
        "Sony XB23", "Realme Cobble",
        "Mi Outdoor", "Portronics Breeze",
        "Infinity Clubz", "Zebronics County",
        "Marshall Stockwell", "Harman Kardon Aura",
        "JBL Charge 5", "Boat PartyPal",
        "Sony XB43", "Realme Pocket",
        "Mi Smart Speaker", "Portronics Dash",
        "Infinity Tranz", "Zebronics Sound Feast",
        "Marshall Kilburn", "Harman Kardon Luna",
        "JBL Clip 4", "Boat Stone SpinX",
        "Sony XB33", "Realme 360",
        "Mi Mini Speaker"
		};
		System.out.println("\n"+"BluetoothSpeaker Brands are :"+"\n");
			return speakerBrands;
		}
		
		if (productName=="Trimmer") {
			String[] trimmerBrands = {
        "Philips BT1232", "Mi Beard Trimmer",
        "Syska HT200", "Nova NHT1045",
        "Panasonic ER207", "Havells BT9005",
        "Realme Beard Trimmer", "Wahl Cordless",
        "Vega T1", "Lifelong LLPCM05",
        "Philips BT3221", "Mi Trimmer 2C",
        "Syska UltraTrim", "Nova Prime",
        "Panasonic ER305", "Havells RS7005",
        "Realme Trimmer Plus", "Wahl Stainless",
        "Vega X1", "Lifelong Groom Pro",
        "Philips Multigroom", "Mi Grooming Kit",
        "Syska Beard Pro", "Nova Pro",
        "Panasonic ER203", "Havells BT5200",
        "Realme Groom Kit", "Wahl Lithium",
        "Vega Men T2", "Lifelong Beard Trimmer",
        "Philips Series 3000", "Mi Precision",
        "Syska Cordless", "Nova NHT1091",
        "Panasonic Beard"
		};
		System.out.println("\n"+"Trimmer Brands are :"+"\n");
			return trimmerBrands;
		}
		
		if (productName=="Notebook") {
			String[] notebookBrands = {
        "Classmate Long Book", "Navneet Notebook",
        "Camlin Notebook", "Apsara Notebook",
        "Luxor Notebook", "Sundaram Notebook",
        "Unigo Notebook", "Oddy Notebook",
        "Solo Notebook", "Paperkraft Notebook",
        "Classmate Pulse", "Navneet Youva",
        "Camlin Spiral", "Apsara Long Book",
        "Luxor Spiral", "Sundaram Long",
        "Unigo Spiral", "Oddy Spiral",
        "Solo Executive", "Paperkraft Premium",
        "Classmate Project Book", "Navneet Practical",
        "Camlin Practical", "Apsara Practical",
        "Luxor Practical", "Sundaram Practical",
        "Unigo Long Book", "Oddy Long Book",
        "Solo Spiral", "Paperkraft Spiral",
        "Classmate Drawing", "Navneet Drawing",
        "Camlin Drawing", "Apsara Drawing",
        "Luxor Drawing"
		};
		System.out.println("\n"+"Notebook Barnds are :"+"\n");
			return notebookBrands;
		}
		
		if (productName=="Pen") {
			String[] penBrands = {
        "Reynolds 045", "Cello Gripper",
        "Classmate Octane", "Luxor Pilot",
        "Linc Ocean", "Flair WritoMeter",
        "Hauser XO", "Add Gel Achiever",
        "Montex Mega Top", "Parker Vector",
        "Reynolds Trimax", "Cello Butterflow",
        "Classmate Hook", "Luxor Gel",
        "Linc Pentonic", "Flair Inky",
        "Hauser Sonic", "Add Gel Little Master",
        "Montex Winner", "Parker Frontier",
        "Reynolds Racer", "Cello Pinpoint",
        "Classmate Spin", "Luxor Ball Pen",
        "Linc Glycer", "Flair Creative",
        "Hauser Germany", "Add Gel Gold",
        "Montex Smooth", "Parker Beta",
        "Reynolds Bright", "Cello Maxriter",
        "Classmate Pulse Pen", "Luxor Sign Pen",
        "Linc Shine"
		};
		System.out.println("\n"+"Pen Brands are :"+"\n");
		return penBrands;
		}
		
		if (productName=="Pencil") {
			String[] pencilBrands = {
        "Reynolds 045", "Cello Gripper",
        "Classmate Octane", "Luxor Pilot",
        "Linc Ocean", "Flair WritoMeter",
        "Hauser XO", "Add Gel Achiever",
        "Montex Mega Top", "Parker Vector",
        "Reynolds Trimax", "Cello Butterflow",
        "Classmate Hook", "Luxor Gel",
        "Linc Pentonic", "Flair Inky",
        "Hauser Sonic", "Add Gel Little Master",
        "Montex Winner", "Parker Frontier",
        "Reynolds Racer", "Cello Pinpoint",
        "Classmate Spin", "Luxor Ball Pen",
        "Linc Glycer", "Flair Creative",
        "Hauser Germany", "Add Gel Gold",
        "Montex Smooth", "Parker Beta",
        "Reynolds Bright", "Cello Maxriter",
        "Classmate Pulse Pen", "Luxor Sign Pen",
        "Linc Shine"
		};
		System.out.println("\n"+"Pencil Brands are :"+"\n");
		return pencilBrands;
		}
		
		if (productName=="BodyLotion") {
			String[] lotionBrands = {
        "Nivea Nourishing Lotion", "Vaseline Cocoa Glow",
        "Ponds Triple Vitamin", "Himalaya Cocoa Butter",
        "Parachute Advansed", "Dove Essential Nourishment",
        "Mamaearth Ubtan Lotion", "WOW Aloe Vera Lotion",
        "Biotique Bio Aloe", "Vaseline Healthy White",
        "Nivea Extra Whitening", "Ponds Light Moisturizer",
        "Himalaya Aloe & Cucumber", "Parachute Deep Nourish",
        "Dove Supple Bounce", "Mamaearth Vitamin C",
        "WOW Coconut Lotion", "Biotique Morning Nectar",
        "Vaseline Intensive Care", "Nivea Body Milk",
        "Ponds Silk Cream", "Himalaya Olive",
        "Parachute Body Lotion", "Dove Glowing Ritual",
        "Mamaearth Tea Tree", "WOW Shea Butter",
        "Biotique Almond Oil", "Vaseline Lavender",
        "Nivea Oil in Lotion", "Ponds Super Light",
        "Himalaya Rich Cocoa", "Parachute Aloe Vera",
        "Dove Body Love", "Mamaearth Rose",
        "WOW Vitamin E"
		};
		System.out.println("\n"+"BodyLotion Brands are :"+"\n");
			return lotionBrands;
		}
		
		if (productName=="ShavingCream") {
			String[] shavingBrands = {
        "Gillette Regular", "Old Spice Musk",
        "Park Avenue Classic", "Godrej Shaving Cream",
        "Vi-John Premium", "Bombay Shaving Company",
        "Beardo Aloe Vera", "Dettol Cool",
        "Supermax Shaving Cream", "Gillette Lime",
        "Old Spice Fresh Lime", "Park Avenue Good Morning",
        "Godrej Menthol Mist", "Vi-John Herbal",
        "Bombay Shaving Foam", "Beardo Activated Charcoal",
        "Dettol Fresh", "Supermax Ultimate",
        "Gillette Sensitive", "Old Spice Original",
        "Park Avenue Cool Blue", "Godrej Rich Foam",
        "Vi-John Cool", "Bombay Shaving Gel",
        "Beardo Beard Wash", "Dettol Lather",
        "Supermax Classic", "Gillette Series",
        "Old Spice Lather", "Park Avenue Premium",
        "Godrej Cool", "Vi-John Lime",
        "Bombay Shaving Charcoal", "Beardo Smooth",
        "Dettol Menthol"
		};
		System.out.println("\n"+"ShavingCream Barnds are :"+"\n");
			return shavingBrands;
		}
		
		if (productName=="LunchBag") {
			String[] lunchbagBrands = {
        "American Tourister Laptop Bag", "Skybags Laptop Backpack",
        "Wildcraft Laptop Bag", "Safari Office Bag",
        "VIP Laptop Case", "Dell Essential Backpack",
        "HP Odyssey Backpack", "Lenovo Casual Backpack",
        "Asus ROG Backpack", "Targus Classic",
        "American Tourister Office", "Skybags Professional",
        "Wildcraft Work Pack", "Safari Pro",
        "VIP Executive", "Dell Pro Backpack",
        "HP Business Bag", "Lenovo ThinkPad Bag",
        "Asus Travel Backpack", "Targus City Gear",
        "American Tourister Formal", "Skybags Office",
        "Wildcraft Premium", "Safari Laptop Pro",
        "VIP Laptop Backpack", "Dell Urban",
        "HP Classic", "Lenovo Slim",
        "Asus Professional", "Targus Elite",
        "American Tourister Slim", "Skybags Trend",
        "Wildcraft Compact", "Safari Slim",
        "VIP Travel Laptop"
		};
		System.out.println("LunchBag Brands are :"+"\n");
			return lunchbagBrands;
		}
		
		if (productName=="Curtains") {
			String[] curtainBrands = {
        "D'Decor Premium", "Homefab India",
        "Story@Home Curtains", "Spaces Living",
        "Amazon Basics Curtains", "Tranquebar Blackout",
        "Bella Casa Curtains", "Raymond Home",
        "Portico New York", "Bombay Dyeing",
        "D'Decor Blackout", "Homefab Sheer",
        "Story@Home Printed", "Spaces Cotton",
        "Amazon Basics Blackout", "Tranquebar Floral",
        "Bella Casa Sheer", "Raymond Designer",
        "Portico Premium", "Bombay Dyeing Cotton",
        "D'Decor Designer", "Homefab Door Curtain",
        "Story@Home Door", "Spaces Designer",
        "Amazon Basics Sheer", "Tranquebar Solid",
        "Bella Casa Door", "Raymond Classic",
        "Portico Cotton", "Bombay Dyeing Premium",
        "D'Decor Sheer", "Homefab Blackout",
        "Story@Home Blackout", "Spaces Elegant",
        "Amazon Basics Floral"
		};
		System.out.println("\n"+"Curtains Barnds are :"+"\n");
			return curtainBrands;
		}
		
		if (productName=="WallClock") {
			String[] clockBrands = {
        "Ajanta Quartz", "Titan Wall Clock",
        "Seiko Classic", "Casio Wall Clock",
        "Sonata Analog", "Orpat Quartz",
        "Random Modern", "JaipurCrafts Wooden",
        "Chumbak Designer", "Amazon Basics Clock",
        "Ajanta Designer", "Titan Round",
        "Seiko Premium", "Casio Digital",
        "Sonata Round", "Orpat Designer",
        "Random Vintage", "JaipurCrafts Antique",
        "Chumbak Wall Decor", "Amazon Basics Round",
        "Ajanta Plastic", "Titan Classic",
        "Seiko Analog", "Casio Analog",
        "Sonata Classic", "Orpat Round",
        "Random Wooden", "JaipurCrafts Round",
        "Chumbak Modern", "Amazon Basics Plastic",
        "Ajanta Square", "Titan Square",
        "Seiko Square", "Casio Square",
        "Sonata Square"
		};
		System.out.println("\n"+"WallClock Brands are :"+"\n");
			return clockBrands;
		}
		
		
		
			return new String[] {"Product not available"};
    }
}