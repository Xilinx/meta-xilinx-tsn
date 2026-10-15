# The openlldp_1.2.0 recipe (intel/openlldp v1.2.0) already carries the
# 802.3br Additional Ethernet Capabilities TLV (Frame Preemption / MAC
# Merge) that the TSN frame-preemption bring-up drives via
# `lldptool -i <if> set-tlv -V addEthCaps ...`, so no source repin is
# needed here.
#
# The only Xilinx-specific delta is the SIOCDEVPRIVATE+15 offset the TSN
# NIC uses for the is_bridge() ioctl, carried as a single file:// patch.
# It is specific to the staging Xilinx TSN driver and can be dropped once
# the mainline TSN driver is used.

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-lldp_util-use-SIOCDEVPRIVATE-15-for-Xilinx-TSN-NIC.patch"
