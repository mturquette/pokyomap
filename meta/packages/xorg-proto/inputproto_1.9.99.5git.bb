require xorg-proto-common.inc

PR = "r1"
PE = "1"
PV = "1.9.99.5+git${SRCREV}"

SRC_URI = "git://anongit.freedesktop.org/git/xorg/proto/inputproto.git;protocol=http"
S = "${WORKDIR}/git"

BBCLASSEXTEND = "native sdk"
