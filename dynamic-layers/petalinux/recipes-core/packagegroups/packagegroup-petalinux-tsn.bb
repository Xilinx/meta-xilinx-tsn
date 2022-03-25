DESCRIPTION = "TSN related packages"

inherit packagegroup

TSN_PACKAGES = " \
	openavb \
	linuxptp \
	lldpd \
	tsn-utils \
	vlan \
	"

RDEPENDS:${PN} = "${TSN_PACKAGES}"
