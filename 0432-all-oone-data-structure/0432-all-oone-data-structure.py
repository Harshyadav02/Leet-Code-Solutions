class AllOne:
    def __init__(self):
        self.map = {}
    
    def inc(self, key: str) -> None:
        self.map[key] = self.map.get(key, 0) + 1
    
    def dec(self, key: str) -> None:
        if key in self.map:
            self.map[key] -= 1
            if self.map[key] <= 0:
                del self.map[key]
    
    def getMaxKey(self) -> str:
        if not self.map:
            return ""
        max_key = max(self.map, key=self.map.get)
        return max_key
    
    def getMinKey(self) -> str:
        if not self.map:
            return ""
        min_key = min(self.map, key=self.map.get)
        return min_key

# Example usage:
# obj = AllOne()
# obj.inc(key)
# obj.dec(key)
# param_3 = obj.getMaxKey()
# param_4 = obj.getMinKey()
