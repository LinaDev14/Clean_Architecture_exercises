from User_Repository import UserRepository
from User import User

class MySQLUserRepository(UserRepository):
    def get_user(self):
        # Simulación de obtención de datos de MySQL
        # En este caso, se puede implementar lógica para obtener datos de una base de datos en memoria
        user_data = {"name": "John Doe", "email": "john@example.com"}
        return User(user_data["name"], user_data["email"])