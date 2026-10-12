SUMMARY = "Packagegroup pulling in the AMD Xilinx Time-Sensitive \
Networking (TSN) runtime - gPTP, tsn-utils, tsn-examples and \
supporting tools."
DESCRIPTION = "TSN packages"

inherit packagegroup

TSN_PACKAGES = " \
	ethtool \
	gptp \
	linuxptp \
	lldpd \
	openlldp \
	tsn-examples \
	tsn-utils \
	vlan \
	"

RDEPENDS:${PN} = "${TSN_PACKAGES}"
