require glib.inc

PR = "r0"

SRC_URI = "http://ftp.gnome.org/pub/GNOME/sources/glib/2.18/glib-${PV}.tar.bz2 \
	file://glibconfig-sysdefs.h \
	file://configure-libtool.patch;patch=1"
