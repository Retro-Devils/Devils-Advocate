.class public Lcom/android/billingclient/api/l$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/l$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/l$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/l;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/l;

    invoke-direct {v0}, Lcom/android/billingclient/api/l;-><init>()V

    iget-object v1, p0, Lcom/android/billingclient/api/l$b;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/l;->a(Lcom/android/billingclient/api/l;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/android/billingclient/api/l$b;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/l;->b(Lcom/android/billingclient/api/l;Ljava/util/List;)Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/List;)Lcom/android/billingclient/api/l$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/l$b;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/android/billingclient/api/l$b;->b:Ljava/util/List;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/l$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/l$b;->a:Ljava/lang/String;

    return-object p0
.end method
