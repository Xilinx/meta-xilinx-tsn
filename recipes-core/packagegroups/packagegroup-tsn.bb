SUMMARY = "Packagegroup pulling in the AMD Xilinx Time-Sensitive \
Networking (TSN) runtime - gPTP, tsn-utils, tsn-examples and \
supporting tools."
DESCRIPTION = "TSN packages"

inherit packagegroup

TSN_PACKAGES = " \
	gptp \
	linuxptp \
	lldpd \
	tsn-examples \
	tsn-utils \
	vlan \
	"

RDEPENDS:${PN} = "${TSN_PACKAGES}"
