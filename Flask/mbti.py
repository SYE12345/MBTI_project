import pandas as pd
from selenium import webdriver
from selenium.webdriver import ActionChains
from bs4 import BeautifulSoup
from flask_cors import CORS
<<<<<<< HEAD
from webdriver_manager.chrome import ChromeDriverManager
import time
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
import re
from flask import Flask, render_template, request, jsonify
=======
import time
from selenium.webdriver.chrome.options import Options
import re
from flask import Flask, render_template, request, jsonify
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
>>>>>>> jun/master

app = Flask(__name__, template_folder='templates')
CORS(app)

def run_mbti_test():
    print('Debug1')
    chrome_options = Options()
    chrome_options.add_argument("--headless")
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    print('Debug2')
    driver.get("https://www.16personalities.com/ko/%EB%AC%B4%EB%A3%8C-%EC%84%B1%EA%B2%A9-%EC%9C%A0%ED%98%95-%EA%B2%80%EC%82%AC")
    print('Debug3')
<<<<<<< HEAD
    driver.implicitly_wait(10)
    button = driver.find_element_by_xpath('//*[@class="card__text"]')
=======
    driver.implicitly_wait(3600)
    button = driver.find_element(By.XPATH, '//*[@class="card__text"]')
>>>>>>> jun/master
    ActionChains(driver).click(button).perform()
    soup = BeautifulSoup(driver.page_source, 'html.parser')
    table = soup.find('div', {'class': ['results__type__code results__type__code--blue',
                                        'results__type__code results__type__code--yellow',
                                        'results__type__code results__type__code--green',
                                        'results__type__code results__type__code--purple']})

    p = re.compile('[\n](.*?)[\n]')
    table = p.findall(str(table))
    table3 = pd.DataFrame({'URL': table})
    table3.URL = table3.URL.str.replace(' ', '')
    result_url = table3.iloc[0]['URL']

    driver.quit()
    return result_url

@app.route('/')
def index():
<<<<<<< HEAD
    return render_template('member/join.html')
=======
    return render_template('join.html')
>>>>>>> jun/master

@app.route('/start_mbti_test', methods=['GET'])
def start_mbti_test():
    result = run_mbti_test()
    return jsonify({'message': '검사가 완료되었습니다.', 'result': result}), 200

if __name__ == '__main__':
    app.run(debug=True, port=5000)
