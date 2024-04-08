from abc import ABC, abstractmethod
from User import User

class UserRepository(ABC):
    @abstractmethod
    def get_user(self):
        pass