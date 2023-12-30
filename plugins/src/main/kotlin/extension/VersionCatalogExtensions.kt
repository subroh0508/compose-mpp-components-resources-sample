package extension

import org.gradle.api.Project
import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

internal val VersionCatalog.androidxActivities: Provider<ExternalModuleDependencyBundle> get() = getBundle("androidx-activities")

internal val Project.libs: VersionCatalog get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

private fun VersionCatalog.getLibrary(library: String) = findLibrary(library).get()
private fun VersionCatalog.getBundle(bundle: String) = findBundle(bundle).get()
