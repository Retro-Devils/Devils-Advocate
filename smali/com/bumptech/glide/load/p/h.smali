.class public interface abstract Lcom/bumptech/glide/load/p/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/bumptech/glide/load/p/h;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/bumptech/glide/load/p/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/load/p/h$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/p/h$a;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/p/h;->a:Lcom/bumptech/glide/load/p/h;

    new-instance v0, Lcom/bumptech/glide/load/p/j$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/p/j$a;-><init>()V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/p/j$a;->a()Lcom/bumptech/glide/load/p/j;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/p/h;->b:Lcom/bumptech/glide/load/p/h;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
