require xserver-xf86-dri-lite.inc

PE = "1"
PR = "r1"

SRC_URI += "file://drmfix.patch;patch=1"
