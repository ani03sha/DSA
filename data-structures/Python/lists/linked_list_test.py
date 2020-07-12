import unittest
from lists import linked_list
from lists.linked_list import Node


class LinkedListTest(unittest.TestCase):

    @classmethod
    def setUp(cls):
        cls.head = Node(1)
        cls.head.next = Node(2)
        cls.head.next.next = Node(3)
        cls.head.next.next.next = Node(4)
        cls.head.next.next.next.next = Node(5)

    def test_traversal(self):
        expected = '1   2   3   4   5   '
        actual = linked_list.traversal(self)
        self.assertEqual(expected, actual)

    def test_get(self):
        self.assertEqual(2, linked_list.get(self, 1))
        self.assertEqual(5, linked_list.get(self, 4))
        self.assertEqual(-1, linked_list.get(self, 10))

    def test_insert_at_head(self):
        linked_list.insert_at_head(self, 6)
        self.assertEqual(6, linked_list.get(self, 0))
        self.assertEqual(1, linked_list.get(self, 1))
        linked_list.insert_at_head(self, 7)
        self.assertEqual(7, linked_list.get(self, 0))

    def test_insert_at_tail(self):
        linked_list.insert_at_tail(self, 6)
        self.assertEqual(6, linked_list.get(self, 5))
        linked_list.insert_at_tail(self, 7)
        self.assertEqual(7, linked_list.get(self, 6))

    def test_insert_at_position(self):
        linked_list.insert_at_index(self, 6, 2)
        self.assertEqual(3, linked_list.get(self, 3))
        linked_list.insert_at_index(self, 7, 1)
        self.assertEqual(6, linked_list.get(self, 3))

    def test_remove(self):
        linked_list.remove(self, self.head.next.next)
        self.assertEqual(4, linked_list.get(self, 2))
        linked_list.remove(self, self.head)
        self.assertEqual(2, linked_list.get(self, 0))


if __name__ == '__main__':
    unittest.main()
