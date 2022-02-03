.class public final Lc/b/a/a/e/i;
.super Lcom/google/android/gms/common/internal/v/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/b/a/a/e/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:J

.field public final c:[Lc/b/a/a/e/a;

.field public final d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/e/j;

    invoke-direct {v0}, Lc/b/a/a/e/j;-><init>()V

    sput-object v0, Lc/b/a/a/e/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[Lc/b/a/a/e/a;IZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/v/a;-><init>()V

    iput-wide p1, p0, Lc/b/a/a/e/i;->b:J

    iput-object p3, p0, Lc/b/a/a/e/i;->c:[Lc/b/a/a/e/a;

    iput-boolean p5, p0, Lc/b/a/a/e/i;->e:Z

    if-eqz p5, :cond_0

    iput p4, p0, Lc/b/a/a/e/i;->d:I

    return-void

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lc/b/a/a/e/i;->d:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-wide v1, p0, Lc/b/a/a/e/i;->b:J

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/v/c;->h(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lc/b/a/a/e/i;->c:[Lc/b/a/a/e/a;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/v/c;->l(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget p2, p0, Lc/b/a/a/e/i;->d:I

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/v/c;->g(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lc/b/a/a/e/i;->e:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/v/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
