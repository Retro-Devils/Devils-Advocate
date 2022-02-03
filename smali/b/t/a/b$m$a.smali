.class final Lb/t/a/b$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/t/a/b$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Lb/t/a/b$m;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lb/t/a/b$m;
    .locals 2

    new-instance v0, Lb/t/a/b$m;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb/t/a/b$m;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lb/t/a/b$m;
    .locals 1

    new-instance v0, Lb/t/a/b$m;

    invoke-direct {v0, p1, p2}, Lb/t/a/b$m;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public c(I)[Lb/t/a/b$m;
    .locals 0

    new-array p1, p1, [Lb/t/a/b$m;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lb/t/a/b$m$a;->a(Landroid/os/Parcel;)Lb/t/a/b$m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb/t/a/b$m$a;->b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lb/t/a/b$m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lb/t/a/b$m$a;->c(I)[Lb/t/a/b$m;

    move-result-object p1

    return-object p1
.end method
