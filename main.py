from User_Service import User_Service
from MySQL_User_Repository import MySQL_User_Repository

def main():
    user_service = User_Service(MySQL_User_Repository())
    user = user_service.get_user()
    print("User:", user)

if __name__ == "__main__":
    main()