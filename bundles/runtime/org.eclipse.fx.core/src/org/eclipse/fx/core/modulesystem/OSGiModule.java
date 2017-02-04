package org.eclipse.fx.core.modulesystem;

import java.util.Optional;

import org.eclipse.fx.core.Version;
import org.osgi.framework.Bundle;

public class OSGiModule implements Module {
	private Bundle bundle;

	public OSGiModule(Bundle bundle) {
		this.bundle = bundle;
	}

	@Override
	public String getId() {
		return this.bundle.getSymbolicName();
	}

	@Override
	public Optional<Version> getVersion() {
		return Optional.of(new BundleVersion(this.bundle.getVersion()));
	}

	static class BundleVersion extends Version {
		private final org.osgi.framework.Version version;

		public BundleVersion(org.osgi.framework.Version version) {
			this.version = version;
		}

		@Override
		public int compareTo(Version o) {
			int rv = Integer.compare(getMajor(), o.getMajor());
			if (rv != 0) {
				return rv;
			}

			rv = Integer.compare(getMinor(), o.getMinor());
			if (rv != 0) {
				return rv;
			}

			rv = Integer.compare(getMicro(), o.getMicro());
			if (rv != 0) {
				return rv;
			}

			return getQualifier().orElse("").compareTo(o.getQualifier().orElse("")); //$NON-NLS-1$//$NON-NLS-2$
		}

		@Override
		public int getMajor() {
			return this.version.getMajor();
		}

		@Override
		public int getMinor() {
			return this.version.getMinor();
		}

		@Override
		public int getMicro() {
			return this.version.getMicro();
		}

		@Override
		public Optional<String> getQualifier() {
			return Optional.ofNullable(this.version.getQualifier());
		}

	}
}
