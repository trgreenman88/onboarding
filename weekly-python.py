def doesBrickFit(height, width, depth, holeWidth, holeHeight):
    if height <= holeHeight and width <= holeWidth:
        return True
    else:
        return False

print(doesBrickFit(1,1,1,1,1))
print(doesBrickFit(1,2,1,1,1))
print(doesBrickFit(1,2,2,1,1))
