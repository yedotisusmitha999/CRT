
class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def search_element(root, key):
    if root is None:
        return False
    if root.data == key:
        return True
    # Search in left subtree or right subtree
    return search_element(root.left, key) or search_element(root.right, key)

# Example usage:
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)

print(search_element(root, 3))  # True
print(search_element(root, 5))  # False
