import requests

def get_fact():
    url = "https://uselessfacts.jsph.pl/api/v2/facts/random"
    response = requests.get(url)
    data = response.json()
    return data["text"]

# ---- outside the function ----
n = int(input("Enters a number (between 1 and 7: "))

if n > 7:
    print("Maximum number of facts per execution is 7")
elif n < 1:
    print("Minimum number of facts per execution is 1")
else:
    for i in range(n):
        print(f"\nFact {i + 1}:")
        print(get_fact())