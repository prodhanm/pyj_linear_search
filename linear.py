# for clarification, the num variable is used as an index in the search function
def search(li, num, key):
    for num in range(len(li)):
        if li[num] == key:
            return num
    return -1
        
def main():
    li = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    num = int(input("Enter a number of an element: "))
    key = 50
    ind = search(li, num, key)
    if ind == -1:
        print("Element not found")
    else:
        print(f"Element found at index {ind}")

if __name__ == "__main__":
    main()