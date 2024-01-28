import cv2

# provide the source file as you want
img = cv2.imread('./final lab/3.jpg')

# using cvtcolor we can convert RGB image to GRAY
imggray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

# using Gaussian blur function we can blur the image
imgblur = cv2.GaussianBlur(imggray, (9, 9), 0)

# to show the output image
cv2.imshow('output', img)

# to show the blur image
cv2.imshow('blur image', imgblur)

# to show the gray image
cv2.imshow('gray image', imggray)

cv2.waitKey(0)
cv2.destroyAllWindows()
