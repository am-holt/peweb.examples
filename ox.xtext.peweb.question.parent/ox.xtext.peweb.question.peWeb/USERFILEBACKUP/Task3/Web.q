Section Intro {  
    Title "Car Survey"
    MultipleChoiceQuestion "Do you own a car?"{
        Answer "yes" goto OwnsCar
        Answer "no" goto DoesntOwnCar
    } 
}

Section OwnsCar {  
    
    Description "This section is all about your car"

    TextQuestion "What make is it?"
    TextQuestion "What model is it?"
    TextQuestion "How many miles have you done with it?"
    MultipleChoiceQuestion "What type of fuel does it use?" {
        Answer "Petrol"
        Answer "Diesel" 
        Answer "Electric"
    }            
    MultipleChoiceQuestion "How many years have you owned this car?"{
        Answer "0-2 years"
        Answer "2-5 years"
        Answer "5-8 years"
        Answer "8+ years"
    }    
} goto IdealNewCar

Section DoesntOwnCar {  
 
    MultipleChoiceQuestion "Have you ever owned a car?"{
        Answer "yes" goto HasOwnedCar
        Answer "no" 
    }
    
    TextQuestion "What is the biggest reason you don't own a car?"
    
} End

Section HasOwnedCar {  
     
    TextQuestion "Why did you get rid of your previous car?"
    MultipleChoiceQuestion "Would you consider ever buying a car again?"{
        Answer "Yes" goto IdealNewCar
        Answer "No"
    }
} End

Section IdealNewCar{  

    Description "This section asks you about your ideal car" 
    MultipleChoiceQuestion "What type of fuel would your ideal car use?" {
        Answer "Petrol"
        Answer "Diesel" 
        Answer "Electric"
    }
    MultipleChoiceQuestion "Which of the following do you think is the most important?" {
        Answer "Drive of the car"
        Answer "Looks of the vehicle" 
        Answer "Environmental impact "
        Answer "Price"
    }
    TextQuestion "What is the most amount of money you would consider spending on a car?"

}
