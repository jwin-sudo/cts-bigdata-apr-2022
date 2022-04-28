#__init__.py is a special file executed when import files from models directory

from .product import Product
# hero after, anybody can import Product from models itself

print("models __init__ called")