.class public Lcom/android/billingclient/api/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/l$b;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/l;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/l;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/android/billingclient/api/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/l;->b:Ljava/util/List;

    return-object p1
.end method

.method public static e()Lcom/android/billingclient/api/l$b;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/l$b;-><init>(Lcom/android/billingclient/api/l$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/l;->b:Ljava/util/List;

    return-object v0
.end method
