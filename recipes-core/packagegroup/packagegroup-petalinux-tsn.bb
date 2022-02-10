DESCRIPTION = "TSN related packages"

inherit packagegroup

TSN_PACKAGES = " \
	gptp \
	linuxptp \
	lldpd \
	misc-utils \
	"

RDEPENDS:${PN} = "${TSN_PACKAGES}"
