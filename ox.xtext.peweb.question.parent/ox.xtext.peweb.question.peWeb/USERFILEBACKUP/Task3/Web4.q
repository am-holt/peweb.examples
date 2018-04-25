Section Intro {  
    Title "Car Survey"
    MultipleChoiceQuestion "Do you own a car?"{
        Answer "yes" goto OwnsCar
        Answer "no" goto DoesntOwnCar
    } 
}

Section OwnsCar {  
    
    Description "This section is all about your car"

    TextualQuestion "What make is it?"
    TextualQuestion "What model is it?"
    TextualQuestion "How many miles have you done with it?"
    MultipleChoiceQuestion "What type of fuel does it use?" {
        Answer "Petrol Diesel Electric"
    }            
    MultipleChoiceQuestion "How many years have you owned this car?"{
        Answer "0-2 years"
        Answer "2-5 years"
        Answer "5-8 years"
        Answer "8+ years"
    }    
} 

Section DoesntOwnCar {  
 
    MultipleChoiceQuestion "Have you ever owned a car?"{
        Answer "yes" goto HasOwnedCar
        Answer "no" 
    }
    
    TextualQuestion "What is the biggest reason you don't own a car?"
    
} End

Section HasOwnedCar {  
     
    Description "This section is all about your car"

    TextualQuestion "What make is it?"
    TextualQuestion "What model is it?"
    TextualQuestion "How many miles have you done with it?"
    MultipleChoiceQuestion "What type of fuel does it use?" {
        Answer "Petrol Diesel Electric"
    }            
    MultipleChoiceQuestion "How many years have you owned this car?"{
        Answer "0-2 years"
        Answer "2-5 years"
        Answer "5-8 years"
        Answer "8+ years"
    }    
} End

Section IdealNewCar{  

    Description "This section is all about your car"

    TextualQuestion "What make is it?"
    TextualQuestion "What model is it?"
    TextualQuestion "How many miles have you done with it?"
    MultipleChoiceQuestion "What type of fuel does it use?" {
        Answer "Petrol Diesel Electric"
    }            
    MultipleChoiceQuestion "How many years have you owned this car?"{
        Answer "0-2 years"
        Answer "2-5 years"
        Answer "5-8 years"
        Answer "8+ years"
    }    

}
