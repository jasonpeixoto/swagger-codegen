package io.swagger.codegen.xamarin;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.XamarinClientCodegen;
import io.swagger.codegen.options.XamarinClientOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class XamarinClientOptionsTest extends AbstractOptionsTest {

    @Tested
    private XamarinClientCodegen clientCodegen;

    public XamarinClientOptionsTest() {
        super(new XamarinClientOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
            clientCodegen.setPackageName(XamarinClientOptionsProvider.PACKAGE_NAME_VALUE);
            times = 1;
            clientCodegen.setOptionalMethodArgumentFlag(true);
            times = 1;
            clientCodegen.setPackageVersion(XamarinClientOptionsProvider.PACKAGE_VERSION_VALUE);
            times = 1;
            clientCodegen.setOptionalAssemblyInfoFlag(true);
            times = 1;
            clientCodegen.setSourceFolder(XamarinClientOptionsProvider.SOURCE_FOLDER_VALUE);
            times = 1;
            clientCodegen.useDateTimeOffset(true);
            times = 1;
            clientCodegen.setOptionalProjectFileFlag(true);
            times = 1;
            clientCodegen.setPackageGuid(XamarinClientOptionsProvider.PACKAGE_GUID_VALUE);
            times = 1;
            clientCodegen.setUseCollection(false);
            times = 1;
            clientCodegen.setReturnICollection(false);
            times = 1;
            clientCodegen.setOptionalEmitDefaultValue(true);
            times = 1;
            clientCodegen.setGeneratePropertyChanged(true);
            times = 1;
        }};
    }
}
