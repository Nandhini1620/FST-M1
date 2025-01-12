# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    
    driver.get("https://training-support.net/")

    
    print("Page title is: ", driver.title)

   
    driver.find_element(By.LINK_TEXT, "About Us").click()

    
    print("New page title is: ", driver.title)