.class public final Lc/b/a/a/f/b/b;
.super Lcom/google/android/gms/common/internal/v/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/k;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/b/a/a/f/b/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:I

.field private c:I

.field private d:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/f/b/c;

    invoke-direct {v0}, Lc/b/a/a/f/b/c;-><init>()V

    sput-object v0, Lc/b/a/a/f/b/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lc/b/a/a/f/b/b;-><init>(ILandroid/content/Intent;)V

    return-void
.end method

.method constructor <init>(IILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/v/a;-><init>()V

    iput p1, p0, Lc/b/a/a/f/b/b;->b:I

    iput p2, p0, Lc/b/a/a/f/b/b;->c:I

    iput-object p3, p0, Lc/b/a/a/f/b/b;->d:Landroid/content/Intent;

    return-void
.end method

.method private constructor <init>(ILandroid/content/Intent;)V
    .locals 1

    const/4 p1, 0x2

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lc/b/a/a/f/b/b;-><init>(IILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final g()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget v0, p0, Lc/b/a/a/f/b/b;->c:I

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->f:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lc/b/a/a/f/b/b;->b:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/v/c;->g(Landroid/os/Parcel;II)V

    iget v1, p0, Lc/b/a/a/f/b/b;->c:I

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/v/c;->g(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lc/b/a/a/f/b/b;->d:Landroid/content/Intent;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/v/c;->i(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
