/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.fx.code.editor.ldef.lDef.Root
import com.google.inject.Inject

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LDefGenerator implements IGenerator {
	@Inject
	JavaFXCodeGenerator generator;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val root = resource.contents.head as Root
		generator.generate(root.languageDefinition, root.name, fsa);
	}
}