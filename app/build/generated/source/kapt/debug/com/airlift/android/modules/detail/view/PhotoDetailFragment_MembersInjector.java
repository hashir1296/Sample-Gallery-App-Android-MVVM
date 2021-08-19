// Generated by Dagger (https://dagger.dev).
package com.airlift.android.modules.detail.view;

import com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhotoDetailFragment_MembersInjector implements MembersInjector<PhotoDetailFragment> {
  private final Provider<PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory> assistedFactoryProvider;

  public PhotoDetailFragment_MembersInjector(
      Provider<PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory> assistedFactoryProvider) {
    this.assistedFactoryProvider = assistedFactoryProvider;
  }

  public static MembersInjector<PhotoDetailFragment> create(
      Provider<PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory> assistedFactoryProvider) {
    return new PhotoDetailFragment_MembersInjector(assistedFactoryProvider);
  }

  @Override
  public void injectMembers(PhotoDetailFragment instance) {
    injectAssistedFactory(instance, assistedFactoryProvider.get());
  }

  @InjectedFieldSignature("com.airlift.android.modules.detail.view.PhotoDetailFragment.assistedFactory")
  public static void injectAssistedFactory(PhotoDetailFragment instance,
      PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory assistedFactory) {
    instance.assistedFactory = assistedFactory;
  }
}
