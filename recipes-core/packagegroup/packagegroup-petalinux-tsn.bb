DESCRIPTION = "TSN related packages"

PACKAGE_ARCH:k26 = "k26"

inherit packagegroup

TSN_PACKAGES = " \
	gptp \
	linuxptp \
	lldpd \
	misc-utils \
	packeth \	
	"

RDEPENDS:${PN} = "${TSN_PACKAGES}"
