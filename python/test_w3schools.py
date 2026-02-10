import pytest
from selenium import webdriver
@pytest.fixture
def setup():
   driver = webdriver.Chrome()
   driver.maximize_window()
   yield driver
   driver.quit()
def test_w3schools_logo(setup):
   setup.get("https://www.w3schools.com")
   logo = setup.find_element("xpath", "//i[@class='fa fa-logo']")
   assert logo.is_displayed()
