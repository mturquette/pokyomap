DESCRIPTION = "Central control for Telepathy connection managers"
HOMEPAGE = "http://mission-control.sourceforge.net/"
LICENSE = "LGPL"
SECTION = "libs"
DEPENDS = "libtelepathy dbus-glib gconf"

SRC_URI = "${SOURCEFORGE_MIRROR}/mission-control/telepathy-mission-control-${PV}.tar.gz \
           file://pkgconfig.patch;patch=1"

inherit autotools_stage pkgconfig

PACKAGES =+ " \
	libmissioncontrol \
	libmissioncontrol-config \
	libmissioncontrol-server \
	libmissioncontrol-dev \
	libmissioncontrol-config-dev \
	libmissioncontrol-server-dev \
	libmissioncontrol-dbg \
	libmissioncontrol-config-dbg \
	libmissioncontrol-server-dbg \
"

FILES_${PN} += "${datadir}/dbus*"

FILES_libmissioncontrol = "${libdir}/libmissioncontrol.so.*"
FILES_libmissioncontrol-config = "${libdir}/libmissioncontrol-config.so.*"
FILES_libmissioncontrol-server = "${libdir}/libmissioncontrol-server.so.*"

FILES_libmissioncontrol-dev = "${libdir}/libmissioncontrol.* \
                               ${includedir}/libmissioncontrol/ \
                	       ${libdir}/pkgconfig/libmissioncontrol.pc"
FILES_libmissioncontrol-config-dev = "${libdir}/libmissioncontrol-config.*"
FILES_libmissioncontrol-server-dev = "${libdir}/libmissioncontrol-server.*"

FILES_libmissioncontrol-dbg = "${libdir}/.debug/libmissioncontrol.so.*"
FILES_libmissioncontrol-config-dbg = "${libdir}/.debug/libmissioncontrol-config.so.*"
FILES_libmissioncontrol-server-dbg = "${libdir}/.debug/libmissioncontrol-server.so.*"
